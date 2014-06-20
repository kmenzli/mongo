package org.kmenzli.archetype.persistence;

import org.kmenzli.archetype.domain.SampleOidEntity;

import com.mongodb.Mongo;
import com.strategicgains.repoexpress.mongodb.MongodbEntityRepository;

public class SampleOidEntityRepository
extends MongodbEntityRepository<SampleOidEntity>
{
	@SuppressWarnings("unchecked")
    public SampleOidEntityRepository(Mongo mongo, String dbName)
	{
		super(mongo, dbName, SampleOidEntity.class);
	}
}
