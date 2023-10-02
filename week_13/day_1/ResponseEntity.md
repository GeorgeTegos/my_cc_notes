# Return ResponseEntities


```
@GetMapping(value = "/pirates")
    public ResponseEntity<List<Pirate>> getAllPirates(){
        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
    }

@GetMapping(value = "/pirates/{id}")
  public ResponseEntity getPirate(@PathVariable Long id){
    return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK) ;
}

@PostMapping(value = "/pirates")
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate){
        return new ResponseEntity<>( pirateRepository.save(pirate), HttpStatus.OK);
    }
```
