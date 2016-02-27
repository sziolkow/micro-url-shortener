package org.home.sziolkow.microservice.management;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by slawek on 26/02/16.
 */
@RepositoryRestResource(collectionResourceRel = "urls", path = "urls")
public interface UrlRepository extends PagingAndSortingRepository<UrlItem, Long> {

}
