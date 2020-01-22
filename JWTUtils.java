/*
 * Created by Aximsoft for Aspiricx
 * Copyright (c) Aximsoft 2019.
 * All rights reserved.
 */
package com.lane.vision.utils;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

public class JWTUtils {

    public static String decodeJWT(String JWTEncoded) throws Exception {
        try {
            String[] split = JWTEncoded.split("\\.");
            //Log.e("JWT_DECODED", "Header: " + getJson(split[0]));
            return getJson(split[1]);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private static String getJson(String strEncoded) throws UnsupportedEncodingException {
        byte[] decodedBytes = Base64.decode(strEncoded, Base64.URL_SAFE);
        return new String(decodedBytes, "UTF-8");
    }
}