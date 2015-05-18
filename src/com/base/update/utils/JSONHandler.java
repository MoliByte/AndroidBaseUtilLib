package com.base.update.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;

import com.base.update.pojo.UpdateInfo;

/**
 * Created by ShelWee on 14-5-8.
 */
public class JSONHandler {

    public static UpdateInfo toUpdateInfo(InputStream is) throws Exception {
        if (is == null){
            return null;
        }
        String byteData = new String(readStream(is));
        is.close();
        JSONObject jsonObject = new JSONObject(byteData);
        UpdateInfo updateInfo = new UpdateInfo();
        updateInfo.setApkUrl(jsonObject.optString("apkUrl"));
        updateInfo.setAppName(jsonObject.optString("appName"));
        updateInfo.setVersionCode(jsonObject.optString("versionCode"));
        updateInfo.setVersionName(jsonObject.optString("versionName"));
        updateInfo.setChangeLog(jsonObject.optString("changeLog"));
        updateInfo.setUpdateTips(jsonObject.optString("updateTips"));
        updateInfo.setIs_force(jsonObject.optInt("is_force"));
        return updateInfo;
    }

    private static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        byte [] array=new byte[1024];
        int len = 0;
        while( (len = inputStream.read(array)) != -1){
            outputStream.write(array,0,len);
        }
        inputStream.close();
        outputStream.close();
        return outputStream.toByteArray();
    }

}
