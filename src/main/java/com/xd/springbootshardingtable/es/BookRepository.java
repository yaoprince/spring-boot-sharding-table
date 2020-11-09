package com.xd.springbootshardingtable.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends ElasticsearchRepository<BookEntity, String> {
}
