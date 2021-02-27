package com.lofxve.wzd.com.Aes;

public class Test {
    public static void main(String[] args) throws Exception {
        AESUtil aesUtil = new AESUtil();
        String DataSecret = "1234567890abcdef";
        String DataSecretIV = "1234567890abcdef";
        String content = "{\"total\": 1, \"stationStatusInfo\": {\"operationID\": \"123456789\",\"stationID\": 11111111111,\n" +
                "\"connectorStatusInfos\" : {\"connectorID\" : 1 ,\"equipmentID\" : 1000000000000000001 ,\n" +
                "\"status\": 4,\"currentA\": 0,\"curentB\": 0,\"currentC\": 0,\"voltageA\": 0,\"voltageB\": 0,\n" +
                "\"voltageC\": 0, \"soc\": 10 }}}";
        //加密
        String encrypt = AESUtil.encrypt(DataSecret, DataSecretIV, content);
        System.out.println(encrypt);
        //解密
        String decrypt = AESUtil.decrypt(DataSecret,DataSecretIV,encrypt);
        System.out.println(decrypt);
    }
}
