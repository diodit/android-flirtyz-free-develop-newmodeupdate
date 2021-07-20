package com.dio.phlurtyz002.utils;

import com.dio.phlurtyz002.BuildConfig;

/**
 * Created by kibrom on 6/21/17.
 */

public class ApiEndPoints {

    public static final String HOST = BuildConfig.URL;

    public static final String SPECIALS_BASE_URL = HOST;

    public static final String UPLOAD_DIRECTORY ="/admin/uploads/advertisment/";

    public static final String ADVERTISMENT ="/admin/api/web/index.php/api/v1";

    public static final String ADVERTISMENT_BANNER ="http://34.217.126.209/";

    public static final String PPC ="/admin/api/web/index.php/api/v1";

    public static final String PaymentURL = "https://flirtyzapp.com/payment/phlurtyzgateway/pay.php";

//    public static final String PaymentURL = SPECIALS_BASE_URL + "paid/flirtypaid";

    public static final String CategoryFree = SPECIALS_BASE_URL + "api/category/getFreeCategories";

    public static final String CategoryById = SPECIALS_BASE_URL + "api/emoji/getByCatId/";


}
