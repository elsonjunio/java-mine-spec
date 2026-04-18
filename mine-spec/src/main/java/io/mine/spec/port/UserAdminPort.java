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

public interface UserAdminPort {

    void setup();

    List<BucketQuota> setBucketQuota(String bucket, String quota);

    List<BucketQuota> getBucketQuota(String bucket);

    List<User> listUsers();

    List<User> getUser(String username);

    List<User> createUser(String username, String password);

    List<User> deleteUser(String username);

    List<User> enableUser(String username);

    List<User> disableUser(String username);

    List<GroupList> listGroups();

    List<GroupInfo> groupInfo(String name);

    List<GroupInfo> createGroup(String name, List<String> users);

    List<GroupInfo> removeGroup(String name);

    List<GroupInfo> removeUsersFromGroup(String name, List<String> users);

    List<GroupInfo> addUsersToGroup(String name, List<String> users);

    List<GroupInfo> enableGroup(String name);

    List<GroupInfo> disableGroup(String name);

    List<Policy> listPolicies();

    List<Policy> getPolicy(String name);

    List<Policy> createPolicy(String name, String filePath);

    List<Policy> deletePolicy(String name);

    List<PolicyAttached> attachPolicy(
            String policy, String username);

    List<PolicyDetached> detachPolicy(
            String policy, String username);

    List<GroupPolicyAttached> attachPolicyToGroup(
            String policy, String group);

    List<GroupPolicyDetached> detachPolicyFromGroup(
            String policy, String group);

    List<GroupPolicyMapp> getPolicyFromGroup(String group);

    List<ServiceAccounts> listServiceAccounts(String username);

    List<CreateServiceAccount> createServiceAccount(
            String username,
            String policy,
            String expiration);

    List<ServiceAccounts> deleteServiceAccount(
            String accessKey);

    List<Object> addNotificationTarget(
            String targetType,
            String identifier,
            Object config);

    List<Object> removeNotificationTarget(
            String targetType,
            String identifier);

    List<Object> listNotificationTargets(
            String targetType);

}
