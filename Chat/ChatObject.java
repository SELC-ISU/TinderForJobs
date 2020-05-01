package Chat;

public class ChatObject {
    private String userId;
    private String name;
    private String profileImageUrl;
    public ChatObject(String userId, String name, String profileImageUrl){
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getName(){
        return name;
    }
    public void setName(String userId){
        this.name = name;
    }
    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String userId){
        this.profileImageUrl = profileImageUrl;
    }
}
