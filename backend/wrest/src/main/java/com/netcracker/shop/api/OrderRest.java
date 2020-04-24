package com.netcracker.shop.api;

import com.netcracker.shop.dto.OrderDto;
import com.netcracker.shop.service.IOrderService;
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
 * The type Order rest.
 */
@RestController
@RequestMapping("/order")
public class OrderRest {

    private final IOrderService service;


    /**
     * Instantiates a new Order rest.
     *
     * @param service the service
     */
    public OrderRest(IOrderService service) {
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
    List<OrderDto> getAll(@PathVariable("id") int id) {
        return service.getAll(id);
    }

    /**
     * Create order detail dto.
     *
     * @param orderDto the order dto
     * @return the order detail dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    OrderDto create(@RequestBody OrderDto orderDto) {
        return service.createOrder(orderDto);
    }
}
