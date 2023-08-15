from app import db

class Location(db.Model):
  __tablename__ = "locations"

  id = db.Column(db.Integer, primary_key=True)
  name = db.Column(db.String(64))
  category = db.Column(db.String(64))
  visits = db.relationship('Visit', backref='location')

  def __repr__(self):
    return f"<Location: {self.id}: {self.name}>"

# #######################################################

class User(db.Model):
    __tablename__ = "users"

    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(64))
    visits = db.relationship('Visit', backref='user')

    def __repr__(self):
        return f"<User: {self.id}: {self.name}>"

# #######################################################

class Visit(db.Model):
    __tablename__ = "visits"

    id = db.Column(db.Integer, primary_key=True) 
    user_id = db.Column(db.Integer, db.ForeignKey('users.id'))
    location_id = db.Column(db.Integer, db.ForeignKey('locations.id'))
    review = db.Column(db.Text())

    def __repr__(self):
        return f"<Visit: {self.id}: {self.review}>"
    

#     SELECT users.id, users.name, locations.name
# FROM users

# -- Join the visits table
# JOIN visits
# ON visits.user_id = users.id

# -- Join locations table()
# JOIN locations
# ON visits.location_id = locations.id

# -- Only for location 1
# WHERE location_id = 1