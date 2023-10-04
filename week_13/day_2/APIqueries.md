

localhost:8080/ships/pirates?named=Jack
```
@GetMapping(value = "/ships/pirates")
    public ResponseEntity getAllShipsWithPirateOnBoard(@RequestParam(name ="named") String name){
        return new ResponseEntity<>(shipRepository.findByPiratesFirstName(name), HttpStatus.OK);
    }
```
