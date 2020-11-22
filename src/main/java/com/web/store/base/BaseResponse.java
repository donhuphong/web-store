package com.web.store.base;

import com.google.gson.JsonObject;
import com.web.store.error.StoreError;

/**
 * Package name : com.web.store.reponse
 * Created by   : tannv
 * Created at   : 11/15/20
 */
public class BaseResponse<T> {
    /**
     * The type Field name.
     */
    public static class FieldName {
        /**
         * Instantiates a new Field name.
         */
        protected FieldName() {
        }

        /**
         * The constant RESULT_CODE.
         */
        public static final String RESULT_CODE = "resultCode";
        /**
         * The constant RESULT_MESSAGE.
         */
        public static final String RESULT_MESSAGE = "resultMessage";
        /**
         * The constant BODY.
         */
        public static final String BODY = "body";

    }

    private int resultCode = StoreError.SUCCESS.code;

    private String resultMessage = StoreError.SUCCESS.desc;

    private T body;

    public BaseResponse() {
    }

    public BaseResponse(JsonObject jsonObject) {
        this.resultCode = jsonObject.get(FieldName.RESULT_CODE).getAsInt();
        this.resultMessage = jsonObject.get(FieldName.RESULT_MESSAGE).getAsString();
    }

    public JsonObject toJson() {
        JsonObject joRes = new JsonObject();
        joRes.addProperty(FieldName.RESULT_CODE, resultCode);
        joRes.addProperty(FieldName.RESULT_MESSAGE, resultMessage);
        joRes.addProperty(FieldName.BODY, body.toString());
        return joRes;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
