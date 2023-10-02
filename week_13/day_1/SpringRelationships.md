Relationships

One - To - Many

Ship
____

@Column(name = "pirates")      
@OneToMany(mappedBy = "ship") \n
@JsonIgnoreProperties({"ship"})   //Ignore ref to ship
private List<Pirate> pirates;


Pirate
______

@ManyToOne  \n
@JoinColumn(name = "ship_id", nullable = false) \n
@JsonIgnoreProperties({"pirates"})  \n
private Ship ship;





MANY TO MANY syntax
For both models
_____________________

> Raid Prospective

@JsonIgnoreProperties({"raids"}) \n
@ManyToMany \n
@JoinTable( \n
      1. name = "pirate_raids",
      1. joinColumns = {
              - @JoinColumn(
                       * name = "raid_id",    // Should be model you working at
                       * nullable = false,
                       *  updatable = false
               )
       },
      1. inverseJoinColumns = {
               - @JoinColumn(
                      * name = "pirate_id", // Should be the model you ref too
                      * nullable = false,
                      * updatable = false
               )
       }
)
private List<Pirate> pirates;



> Pirate Prospective <

@ManyToMany
@JsonIgnoreProperties({"pirates"})
@JoinTable(
        1. name = "pirate_raids",
        1. joinColumns = {
              -  @JoinColumn(
                      *  name = "pirate_id",
                      *  nullable = false,
                      *  updatable = false
                )
        },
        1. inverseJoinColumns = {
              -  @JoinColumn(
                      *  name = "raid_id",
                      *  nullable = false,
                      *  updatable = false
                )
        }
)
private List<Raid> raids;
