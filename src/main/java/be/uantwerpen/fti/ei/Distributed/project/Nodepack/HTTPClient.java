/*
package be.uantwerpen.fti.ei.Distributed.project.Nodepack;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HTTPClient {

    private final RestTemplate restTemplate;

    public HTTPClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    void putIP(String localIP, String goalIP) {
        String url = "http://" + goalIP + ":8081/postIP?ip=" + localIP;
        restTemplate.put(url, String.class);
    }

    String getIP(int ID, String goalIP){
        String url = "http://" + goalIP + ":8081/nodeip?id=" + ID;
        return (restTemplate.getForEntity(url, String.class)).getBody();
    }

    String leave(String nodeID, String goalIP, String upper, String lower) {
        String url = "http://" + goalIP + ":8081/leave?id=" + nodeID + "&lower=" + lower + "&upper=" + upper;
        return restTemplate.getForObject(url, String.class);
    }

    void updateNeighbor(String goalIP, String newID, String what) {
        String url = "http://" + goalIP + ":8081/updateNeighbors?what=" + what + "&id=" + newID;
        restTemplate.put(url, String.class);
    }
}
*/