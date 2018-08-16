package com.hnq.study.bean;

/**
 * @author henengqiang
 * @date 2018/8/16
 */
public class Aliyun {

    /*
     * OSS 文件上传一般有如下几个参数：appKey、appSecret、bucket、endpoint 等。
     */

    private String appKey;

    private String appSecret;

    private String bucket;

    private String endPoint;

    public static Builder options() {
        return new Aliyun.Builder();
    }

    private Aliyun(Builder builder) {
        this.appKey = builder.getAppKey();
        this.appSecret = builder.getAppSecret();
        this.bucket = builder.getBucket();
        this.endPoint = builder.getEndPoint();
    }

    public static class Builder {

        private String appKey;

        private String appSecret;

        private String bucket;

        private String endPoint;

        public Aliyun build() {
            return new Aliyun(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "appKey='" + appKey + '\'' +
                    ", appSecret='" + appSecret + '\'' +
                    ", bucket='" + bucket + '\'' +
                    ", endPoint='" + endPoint + '\'' +
                    '}';
        }

        public String getAppKey() {
            return appKey;
        }

        public Builder setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        public String getAppSecret() {
            return appSecret;
        }

        public Builder setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public String getBucket() {
            return bucket;
        }

        public Builder setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public String getEndPoint() {
            return endPoint;
        }

        public Builder setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }

    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

}
