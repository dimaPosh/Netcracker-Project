package com.netcracker.shop.api;

import com.netcracker.shop.dto.OrderDetailDto;
import com.netcracker.shop.service.IOrderDetailService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * The type Order detail rest.
 */
@RestController
@RequestMapping("/orderdetail")
public class OrderDetailRest {

    private final IOrderDetailService service;


    /**
     * Instantiates a new Order detail rest.
     *
     * @param service the service
     */
    public OrderDetailRest(IOrderDetailService service) {
        this.service = service;
    }

    /**
     * Gets all.
     *
     * @param id the id
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrderDetailDto> getAll(@PathVariable("id") int id) {
        return service.getAll(id);
    }

    /**
     * Create order detail dto.
     *
     * @param orderDetailDto the order detail dto
     * @return the order detail dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    OrderDetailDto create(@RequestBody OrderDetailDto orderDetailDto) {
        return service.createOrderDetail(orderDetailDto);
    }
}
