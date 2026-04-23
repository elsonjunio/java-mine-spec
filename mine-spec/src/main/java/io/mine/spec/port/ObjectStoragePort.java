package io.mine.spec.port;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.mine.spec.dto.object.BucketInfo;
import io.mine.spec.dto.object.BucketUsage;
import io.mine.spec.dto.object.ObjectListResult;
import io.mine.spec.dto.object.ObjectMetadata;
import io.mine.spec.dto.object.ObjectVersion;
import io.mine.spec.exceptions.ObjectStorageException;

public interface ObjectStoragePort {

    void setup() throws ObjectStorageException;

    ObjectListResult listObjects(String bucket, String prefix, Long limit, String continuationToken) throws ObjectStorageException;

    void deleteObject(String bucket, String key) throws ObjectStorageException;

    void copyObject(String sourceBucket, String sourceKey, String destBucket, String destKey) throws ObjectStorageException;

    String generateUploadUrl(String bucket, String key, Long expiresIn, String contentType) throws ObjectStorageException;

    String generateDownloadUrl(
            String bucket,
            String key,
            Long expiresIn,
            String responseContentType,
            String responseContentDisposition) throws ObjectStorageException;


    List<ObjectVersion> listObjectVersions(
        String bucket,
        String key
    ) throws ObjectStorageException;

    void deleteObjectVersion(
        String bucket,
        String key,
        String versionId
    ) throws ObjectStorageException;

    void restoreObjectVersion(
        String bucket,
        String key,
        String versionId
    ) throws ObjectStorageException;

    ObjectMetadata getObjectMetadata(
        String bucket,
        String key
    ) throws ObjectStorageException;

    void updateObjectMetadata(
        String bucket,
        String key,
        Map<String, String> metadata
    ) throws ObjectStorageException;


    Map<String, String> getObjectTags(
        String bucket,
        String key
    ) throws ObjectStorageException;

    void updateObjectTags(
        String bucket,
        String key,
        Map<String, String> tags
    ) throws ObjectStorageException;

    List<BucketInfo> listBuckets() throws ObjectStorageException;

    void createBucket(String name) throws ObjectStorageException;

    void deleteBucket(String name) throws ObjectStorageException;

    void setBucketVersioning(
        String name,
        boolean enabled
    ) throws ObjectStorageException;

    Optional<String> getBucketVersioningStatus(String name) throws ObjectStorageException;

    BucketUsage getBucketUsage(String name) throws ObjectStorageException;

    Optional<Map<String, Object>> getBucketPolicy(
        String bucket) throws ObjectStorageException;

    void putBucketPolicy(
        String bucket,
        Map<String, Object> policy
    ) throws ObjectStorageException;

    void deleteBucketPolicy(
        String bucket
    ) throws ObjectStorageException;

    Optional<Map<String, Object>> getBucketLifecycle(
        String bucket
    ) throws ObjectStorageException;

    void putBucketLifecycle(
        String bucket,
        Map<String, Object> lifecycle
    ) throws ObjectStorageException;

    void deleteBucketLifecycle(
        String bucket
    ) throws ObjectStorageException;

    Map<String, Object> getBucketEvents(
        String bucket
    ) throws ObjectStorageException;

    void putBucketEvents(
        String bucket,
        Map<String, Object> config
    ) throws ObjectStorageException;

    void deleteBucketEvents(
        String bucket
    ) throws ObjectStorageException;


}
