package com.istic.config;

/**
 * @Author: sunwy
 * @Date: 2019/7/26 13:44
 */
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2017120100302116";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIICXQIBAAKBgQDDpuv5jdjkSEi6Ifec7eVykjisPW0xPCT+FfmDsIjQhs05NPwE\n" +
            "ey73RU7oR1yhZBKugAd12JOdkqB7q5CcZCXEHNpFwChpgmuxCqx2OihOQEP3YfCR\n" +
            "Hpkf9w4HYhWrEnMzMLDNP8Ot5arWcFX7RYTdnND4DcQCblR0d/YXqJdHGwIDAQAB\n" +
            "AoGAdfLqbY7DA5REK9oQYY3VdkWKXuPFMRpWHst2mZpSUIwDqoozqCvu+2jQEh37\n" +
            "TNx8mrBaTwQasbLUhtm+G1oQnWS1ePsKK7Je/rSM8hUiptZKJvIGU+9Nv1vETEWS\n" +
            "16V8ugqECi4LxuTywTc6rE/+lmafYqc1lTvIVsEmtelYzhkCQQDqvWTf7SxWsNw1\n" +
            "mV5nUaUgD6/7NN7bc3s1tLQNHM21CLBXxscwfB6nudmQ8y526tVeuv0dj99AWBja\n" +
            "ONfmZKqlAkEA1V9AFThWe5yNUGvaJPSVVMklDVihhy2BZKKuGsWuccdg/ySUylTA\n" +
            "lDSotBp1f1g63aOsRdrpTVLWNllISQg+vwJBAMrfZI8jK27A65BnPG+O4GcVJ8Kz\n" +
            "rud6psGDqxiqDB6po744zW3Z16SduqrLgRzFWCLG+HrUHN4/RTtUZUN5PQECQA+B\n" +
            "06t3I7nqH88Xd4w2BmBaGgpFRcAIS54fwJ2Lfmkgf2krpHCsBi7/QL+OKLnvlJ+l\n" +
            "FJEjHs+S1KSwinNcWQsCQQCp3+dAwj69BPfGcEUNm/9/EHL/Pgus8TucSbME8M/N\n" +
            "J38KK9ilt0JFifD2q+Yu7h+1VPeooixA0D3uxXrsqsLo";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:9093/api/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "";
    //超时时间
    public  static  String time_express="2m";
    // 请求网关地址
    public static String URL = "https://openapi.alipay.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
