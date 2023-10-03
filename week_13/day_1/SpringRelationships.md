Relationships

One - To - Many
Ship - to - Pirates

______
> Ship

```
@Column(name = "pirates")      
@OneToMany(mappedBy = "ship")
@JsonIgnoreProperties({"ship"})   //ignore ref to ship to avoid circular reference
private List<Pirate> pirates;
```
______

> Pirate

```
@ManyToOne  
@JoinColumn(name = "ship_id", nullable = false)
@JsonIgnoreProperties({"pirates"})  //ignore ref to pirates list to avoid circular reference
private Ship ship;
```



______

MANY TO MANY syntax
For both models
______


> Raid Prospective
```

import org.hibernate.annotations.CascadeType;


@ManyToMany
@JsonIgnoreProperties({"raids"})      // Ignore the JSON property to avoid circular reference
@Cascade(CascadeType.SAVE_UPDATE)
@JoinTable(
       name = "pirate_raids",     //Name of the joined Table

       joinColumns = {
               @JoinColumn(
                       name = "raid_id",    // Column name for the current ID to join
                       nullable = false,
                       updatable = false
               )
       },
       inverseJoinColumns = {
               @JoinColumn(
                       name = "pirate_id",  // Column name for the joined column ID
                       nullable = false,
                       updatable = false
               )
       }
 )
 private List<Pirate> pirates;
```

______

> Pirate Prospective <
```

import org.hibernate.annotations.CascadeType;




@ManyToMany
@JsonIgnoreProperties({"pirates"})         // Ignore the JSON property to avoid circular reference
@Cascade(CascadeType.SAVE_UPDATE)
@JoinTable(
         name = "pirate_raids",             // Name of the joined table
         joinColumns = {
                @JoinColumn(
                        name = "pirate_id",  // Column name for the current ID to join
                        nullable = false,
                        updatable = false
                )
        },
         inverseJoinColumns = {
                @JoinColumn(
                        name = "raid_id",    // Column name for the joined column ID
                        nullable = false,
                        updatable = false
                )
        }
)
private List<Raid> raids;
```
