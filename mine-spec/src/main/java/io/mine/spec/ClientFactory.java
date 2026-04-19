package io.mine.spec;

import io.mine.spec.port.ObjectStoragePort;
import io.mine.spec.port.UserAdminPort;

public interface ClientFactory {

    UserAdminPort getAdminClient();
    ObjectStoragePort getS3Client(Object sts_credentials);

}
