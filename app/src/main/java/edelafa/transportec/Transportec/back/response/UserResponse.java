package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import edelafa.transportec.Transportec.back.Pojos.User;

public class UserResponse extends BaseResponse {
    @SerializedName("Usuarios")
    public Users users;

    public static class Users {
        @SerializedName("usuario")
        public ArrayList<User> user;
    }
}
