package io.mine.spec.port;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.mine.spec.dto.object.BucketInfo;
import io.mine.spec.dto.object.BucketUsage;
import io.mine.spec.dto.object.ObjectListResult;
import io.mine.spec.dto.object.ObjectMetadata;
import io.mine.spec.dto.object.ObjectVersion;

public interface ObjectStoragePort {

    void setup();

    ObjectListResult listObjects(String bucket, String prefix, Long limit, String continuationToken);

    void deleteObject(String bucket, String key);

    void copyObject(String sourceBucket, String sourceKey, String destBucket, String destKey);

    String generateUploadUrl(String bucket, String key, Long expiresIn, String contentType);

    String generateDownloadUrl(
            String bucket,
            String key,
            Long expiresIn,
            String responseContentType,
            String responseContentDisposition);


    List<ObjectVersion> listObjectVersions(
        String bucket,
        String key
    );

    void deleteObjectVersion(
        String bucket,
        String key,
        String versionId
    );

    void restoreObjectVersion(
        String bucket,
        String key,
        String versionId
    );

    ObjectMetadata getObjectMetadata(
        String bucket,
        String key
    );

    void updateObjectMetadata(
        String bucket,
        String key,
        Map<String, String> metadata
    );


    Map<String, String> getObjectTags(
        String bucket,
        String key
    );

    void updateObjectTags(
        String bucket,
        String key,
        Map<String, String> tags
    );

    List<BucketInfo> listBuckets();

    void createBucket(String name);

    void deleteBucket(String name);

    void setBucketVersioning(
        String name,
        boolean enabled
    );

    Optional<String> getBucketVersioningStatus(String name);

    BucketUsage getBucketUsage(String name);

    Optional<Map<String, Object>> getBucketPolicy(
        String bucket);

    void putBucketPolicy(
        String bucket,
        Map<String, Object> policy
    );

    void deleteBucketPolicy(
        String bucket
    );

    Optional<Map<String, Object>> getBucketLifecycle(
        String bucket
    );

    void putBucketLifecycle(
        String bucket,
        Map<String, Object> lifecycle
    );

    void deleteBucketLifecycle(
        String bucket
    );

    Map<String, Object> getBucketEvents(
        String bucket
    );

    void putBucketEvents(
        String bucket,
        Map<String, Object> config
    );

    void deleteBucketEvents(
        String bucket
    );


}
