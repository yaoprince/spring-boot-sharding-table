package com.xd.springbootshardingtable.es;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.Strings;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.elasticsearch.common.xcontent.XContentFactory.*;

import java.io.IOException;
import java.util.Date;

@Service
public class BusReceiverServiceImp implements  BusReceiverService{

    @Autowired
    ReceiverRepository receiverRepository;

    @Override
    public void save(BusReceiverEntity t) {
        receiverRepository.save(t);
    }

    public  String get() throws IOException {

        //Low Level Client init
        RestClient lowLevelRestClient = RestClient.builder(
                new HttpHost("localhost", 9200, "http")).build();
        //High Level Client init
//        RestHighLevelClient client =  new RestHighLevelClient(lowLevelRestClient);
        return null;
    }
}
