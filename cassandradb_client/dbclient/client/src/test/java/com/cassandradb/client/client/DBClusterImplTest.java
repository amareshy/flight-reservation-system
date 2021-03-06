package com.cassandradb.client.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cassandradb.client.client.AppConfig;
import com.cassandradb.client.client.service.DBCluster;
import com.cassandradb.client.client.service.exceptions.UnableToProcessException;
import com.cassandradb.client.client.service.status.StatusAdmin;

/**
 * Unit test for DBCluster.
 */
// @Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
{ AppConfig.class })
public class DBClusterImplTest
{
    @Autowired
    private DBCluster myDBCluster;

    @Test
    public void testStatusAdminForClusterConnection()
        throws UnableToProcessException
    {
	assertNotNull(myDBCluster);
	StatusAdmin statusAdmin = myDBCluster.getStatusAdmin();
	assertNotNull(statusAdmin);
	assertTrue(statusAdmin.isConnected());
    }

}
