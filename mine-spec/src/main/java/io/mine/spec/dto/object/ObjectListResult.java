package io.mine.spec.dto.object;

import java.util.List;

public record ObjectListResult(
    List<StorageObject> objects,
    boolean isTruncated,
    String nextContinuationToken
) 
{
      public ObjectListResult {
          objects = List.copyOf(objects);
      }
  }
