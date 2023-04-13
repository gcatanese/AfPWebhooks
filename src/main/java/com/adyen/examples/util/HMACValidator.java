package com.adyen.examples.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;


import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SignatureException;

@Service
public class HMACValidator {

    public static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";

    public boolean validateHMAC(String payload, String hmacSignature, String hmacKey) throws IllegalArgumentException, SignatureException {
        if (payload == null ) {
            throw new IllegalArgumentException("Missing payload");
        }
        if (hmacSignature == null ) {
            throw new IllegalArgumentException("Missing HMAC signature");
        }
        if (hmacKey == null) {
            throw new IllegalArgumentException("Missing HMAC key");
        }

        System.out.println(calculateHMAC(payload, hmacKey));

        final byte[] merchantSign = hmacSignature.getBytes(StandardCharsets.UTF_8);
        final byte[] expectedSign = (calculateHMAC(payload, hmacKey)).getBytes(StandardCharsets.UTF_8);

        return MessageDigest.isEqual(merchantSign, expectedSign);
    }

    public String calculateHMAC(String payload, String hmacKey) throws IllegalArgumentException, SignatureException {
        try {
            if (payload == null ) {
                throw new IllegalArgumentException("Missing payload");
            }
            if (hmacKey == null) {
                throw new IllegalArgumentException("Missing HMAC key");
            }

            // decode HEX Key into bytes
            byte[] keyBytes = Hex.decodeHex(hmacKey.toCharArray());

            // get payload in bytes
            byte[] payloadBytes = payload.getBytes("UTF-8");

            // instantiate the MAC object using HMAC / SHA256
            Mac hmacSha256 = Mac.getInstance(HMAC_SHA256_ALGORITHM);

            // create a key object using the secret key and MAC object
            SecretKey secretKey = new SecretKeySpec(keyBytes, hmacSha256.getAlgorithm());

            // initialise the MAC object
            hmacSha256.init(secretKey);

            // finalize the MAC operation
            byte[] signedPayload = hmacSha256.doFinal(payloadBytes);
            // encode the signed payload in Base64
            byte[] encodedSignedPayload = new Base64().encode(signedPayload);

            // Base64-encode the hmac
            return new String(encodedSignedPayload);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Missing data or key.");
        } catch (Exception e) {
            throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
        }
    }
}
