/* 
 * Copyright (c) 2008-2010, Hazel Ltd. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hazelcast.impl.concurrentmap;

import com.hazelcast.impl.CMap;
import com.hazelcast.impl.DefaultNearCacheRecord;
import com.hazelcast.impl.DefaultRecord;
import com.hazelcast.impl.NearCacheRecord;
import com.hazelcast.impl.Record;
import com.hazelcast.nio.Data;

public class DefaultRecordFactory implements RecordFactory {
	
	public Record createNewRecord(CMap cmap, int blockId, Data key, Data value,
			long ttl, long maxIdleMillis, long id) {
		return new DefaultRecord(cmap, blockId, key, value, ttl, maxIdleMillis, id);
	}

	public NearCacheRecord createNewNearCacheRecord(Data key, Data value) {
		return new DefaultNearCacheRecord(key, value);
	}

}
