package net.cuscatlan.cusbeerservice.web.controller;

/*
Creado por Renato Bonilla 24/8/2022 : 17:02
*/

import net.cuscatlan.cusbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId ){

        // Implementar con el servicio
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto){

        // Implementar con el servicio
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId) {

        // Implementar con el servicio
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
