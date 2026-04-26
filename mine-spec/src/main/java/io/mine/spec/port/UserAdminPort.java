package io.mine.spec.port;

import java.util.List;

import io.mine.spec.dto.admin.Policy;
import io.mine.spec.dto.admin.PolicyAttached;
import io.mine.spec.dto.admin.PolicyDetached;
import io.mine.spec.dto.admin.BucketQuota;
import io.mine.spec.dto.admin.CreateServiceAccount;
import io.mine.spec.dto.admin.GroupInfo;
import io.mine.spec.dto.admin.GroupList;
import io.mine.spec.dto.admin.GroupPolicyAttached;
import io.mine.spec.dto.admin.GroupPolicyDetached;
import io.mine.spec.dto.admin.GroupPolicyMapp;
import io.mine.spec.dto.admin.ServiceAccounts;
import io.mine.spec.dto.admin.User;
import io.mine.spec.exceptions.UserAdminException;

public interface UserAdminPort {

    void setup() throws UserAdminException;

    List<BucketQuota> setBucketQuota(String bucket, String quota) throws UserAdminException;

    List<BucketQuota> getBucketQuota(String bucket) throws UserAdminException;

    List<User> listUsers() throws UserAdminException;

    List<User> getUser(String username) throws UserAdminException;

    List<User> createUser(String username, String password) throws UserAdminException;

    List<User> deleteUser(String username) throws UserAdminException;

    List<User> enableUser(String username) throws UserAdminException;

    List<User> disableUser(String username) throws UserAdminException;

    List<String> listGroups() throws UserAdminException;

    List<GroupInfo> groupInfo(String name) throws UserAdminException;

    List<GroupInfo> createGroup(String name, List<String> users) throws UserAdminException;

    List<GroupInfo> removeGroup(String name) throws UserAdminException;

    List<GroupInfo> removeUsersFromGroup(String name, List<String> users) throws UserAdminException;

    List<GroupInfo> addUsersToGroup(String name, List<String> users) throws UserAdminException;

    List<GroupInfo> enableGroup(String name) throws UserAdminException;

    List<GroupInfo> disableGroup(String name) throws UserAdminException;

    List<Policy> listPolicies() throws UserAdminException;

    List<Policy> getPolicy(String name) throws UserAdminException;

    List<Policy> createPolicy(String name, String filePath) throws UserAdminException;

    List<Policy> deletePolicy(String name) throws UserAdminException;

    List<PolicyAttached> attachPolicy(
            String policy, String username) throws UserAdminException;

    List<PolicyDetached> detachPolicy(
            String policy, String username) throws UserAdminException;

    List<GroupPolicyAttached> attachPolicyToGroup(
            String policy, String group) throws UserAdminException;

    List<GroupPolicyDetached> detachPolicyFromGroup(
            String policy, String group) throws UserAdminException;

    List<GroupPolicyMapp> getPolicyFromGroup(String group) throws UserAdminException;

    List<ServiceAccounts> listServiceAccounts(String username) throws UserAdminException;

    List<CreateServiceAccount> createServiceAccount(
            String username,
            String policy,
            String expiration) throws UserAdminException;

    List<ServiceAccounts> deleteServiceAccount(
            String accessKey) throws UserAdminException;

    List<Object> addNotificationTarget(
            String targetType,
            String identifier,
            Object config) throws UserAdminException;

    List<Object> removeNotificationTarget(
            String targetType,
            String identifier) throws UserAdminException;

    List<Object> listNotificationTargets(
            String targetType) throws UserAdminException;

}
