# Create a Ninja class with the ninja attributes listed above.
class Ninja:
    def __init__(self,first_name,last_name,pet,treats,pet_food):
        self.first_name = first_name
        self.last_name = last_name
        self.pet = pet
        self.treats = treats
        self.pet_food = pet_food
    # Implement walk(), feed(), bathe() on the ninja class.
    def walk(self):
        Pet.play(health=100)
        return self
    def feed(self):
        Pet.eat(energy=100,health=100)
        return self
    def bathe(self):
        Pet.noise()
        return self


# Create a Pet class with the pet attributes listed above.
class Pet:
    def __init__(self,name,type,tricks,health,energy):
        self.name = name
        self.type = type
        self.tricks = tricks
        self.health = health
        self.energy = energy
    # Implement sleep(), eat(), play(), noise() methods on the pet class.
    def sleep(energy):
        energy += 25
    def eat(energy,health):
        energy += 5
        health += 10
    def play(health):
        health += 5
        return health
    def noise():
        return "BARK BARK BARK"

# Make an instance of a Ninja and assign them an instance of a pet to the pet attribute.
ninja1 = Ninja("Bob", "Johnson", Pet("Rex", "Golden Retriever", "Sit", 100, 100), "dog treats", "dog food")

# Have the Ninja feed, walk , and bathe their pet.
ninja1.feed().walk().bathe()
