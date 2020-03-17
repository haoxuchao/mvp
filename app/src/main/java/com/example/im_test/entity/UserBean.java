package com.example.im_test.entity;

import java.io.Serializable;
import java.util.List;

public class UserBean implements Serializable {

    /**
     * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0aW1lIjoiZmlyc3QiLCJ1c2VySWQiOiI0MDI4OTdmMTZlZGU3YjA4MDE2ZWRlY2E4OGFhMDAzYiIsImlzcyI6InVzZXJtYW5hZ2VyIiwiYXVkIjoicmVzdGFwaXVzZXIiLCJleHAiOjE1NzYxNzA2NzIsIm5iZiI6MTU3NjEzNDY3Mn0.Es_6-fau9A6ewxzv-lynRd_pAHh6JgLMKIqNdKsu_ic
     * userInfo : {"userId":"402897f16ede7b08016edeca88aa003b","userName":"马星","loginName":"马星","userTel":"123456789","userEmail":"3333@126.com","userSource":"","userStatus":null,"userSex":"女","roleList":[{"roleId":11,"roleName":"网格事件处理员","roleDescr":"事件处理的具体操作人员"}]}
     */

    private String access_token;
    private UserInfoBean userInfo;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public static class UserInfoBean implements Serializable{
        /**
         * userId : 402897f16ede7b08016edeca88aa003b
         * userName : 马星
         * loginName : 马星
         * userTel : 123456789
         * userEmail : 3333@126.com
         * userSource :
         * userStatus : null
         * userSex : 女
         * roleList : [{"roleId":11,"roleName":"网格事件处理员","roleDescr":"事件处理的具体操作人员"}]
         */

        private String userId;
        private String userName;
        private String loginName;
        private String userTel;
        private String userEmail;
        private String userSource;
        private Object userStatus;
        private String userSex;
        private List<RoleListBean> roleList;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getUserTel() {
            return userTel;
        }

        public void setUserTel(String userTel) {
            this.userTel = userTel;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserSource() {
            return userSource;
        }

        public void setUserSource(String userSource) {
            this.userSource = userSource;
        }

        public Object getUserStatus() {
            return userStatus;
        }

        public void setUserStatus(Object userStatus) {
            this.userStatus = userStatus;
        }

        public String getUserSex() {
            return userSex;
        }

        public void setUserSex(String userSex) {
            this.userSex = userSex;
        }

        public List<RoleListBean> getRoleList() {
            return roleList;
        }

        public void setRoleList(List<RoleListBean> roleList) {
            this.roleList = roleList;
        }

        public static class RoleListBean implements Serializable{
            /**
             * roleId : 11
             * roleName : 网格事件处理员
             * roleDescr : 事件处理的具体操作人员
             */

            private int roleId;
            private String roleName;
            private String roleDescr;

            public int getRoleId() {
                return roleId;
            }

            public void setRoleId(int roleId) {
                this.roleId = roleId;
            }

            public String getRoleName() {
                return roleName;
            }

            public void setRoleName(String roleName) {
                this.roleName = roleName;
            }

            public String getRoleDescr() {
                return roleDescr;
            }

            public void setRoleDescr(String roleDescr) {
                this.roleDescr = roleDescr;
            }
        }
    }
}
