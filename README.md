[![CircleCI](https://circleci.com/gh/mpomaran/landlord.svg?style=svg&circle-token=fc8c6182b4db3ca2595bee6a565e34ccb7d9ed1f)](https://app.circleci.com/pipelines/github/mpomaran/landlord)
[![codecov](https://codecov.io/gh/mpomaran/landlord/branch/main/graph/badge.svg?token=ZJZ83GC7UC)](https://codecov.io/gh/mpomaran/landlord)

# landlord
DDD showcase project with problem space analysis, system design and various patterns.

# Table of contents

1. [About](#about)
2. [Domain description](#domain-description)
3. [General assumptions](#general-assumptions)
4. [System design](#system-design)  
  4.1 [Process discovery](#process-discovery)  
  4.2 [Solving ambiguity](#solving-ambiguity)  
  4.3 [Interfaces with other systems](#interfaces-with-other-systems)  
   4.3.1 [Payment system](#payment-system)  
   4.3.2 [Protocols and their performance](#protocols-and-their-performance)  
  4.4 [Logical design details](#logical-design-details)  
    4.4.1 [Spring](#spring)  
    4.4.2 [Project structure and architecture](#project-structure-and-architecture)  
      4.4.2.1 [Aggregates](#aggregates)  
      4.4.2.2 [Events](#events)  
      4.4.2.3 [Events in Repositories](#events-in-repositories)  
    4.4.3 [Database](#database)  
      4.4.2.1 [ORM](#orm)  
   4.5 [Physical code design details](#physical-code-design-details)  
      4.5.1 [Architecture-code gap](#architecture-code-gap)    
      4.5.2 [Model-code gap](#model-code-gap)  
   4.6 [Deployment](#deployment)  
   4.7 [Fault tolerance](#fault-tolerance)
5. [Performance](#performance)  
   5.1 [Back of the envelope calculations](#back-of-the-envelope-calculations)  
   5.1 [Scalability](#scalability)  
   5.2 [Monitoring](#monitoring)
6. [Ways to improve, next phases](#ways-to-improve-next-phases)    
7. [Tests](#tests)    
   7.1 [BDD](#bdd)  
   7.2 [ArchUnit](#archunit)
     
## About

This project is an example how one can use DDD to design a simple application.

## Domain description

A landlord rents properties to multiple tenants.
The tenant can report an issue to be fixed. Issues can have different priorities and properties, like pictures before and after or similar.

The landlord needs to keep track of a list of issues to be solved and their status. He needs to keep track of payments. He sends emails or calls if payment is due.

The landlord also needs to keep track of his properties, he needs to be able to store pictures, maps, schematics.

When the landlord rents the property he first creates an agreement with a tenant, documenting the state of the property and generating a contract.
The contract can be modified by adding additional items during the inspection, like a broken cabinet or dented wall.
Contract, together with pictures is signed and stored in the system.
During the stay, the tenant pays the rent according to the contract.
The tenant is able to report issues to be fixed by the landlord. During any period the contract can be canceled or modified by the landlord.
After the stay is completed landlord performs an inspection, after which the property is either to be renovated to ready to be rented. The landlord keeps track of the status of each property and offers only available ones.

For each apartment, the landlord is able to see a list of things to fix, as well as aggregate them by priority and types of fixes, to dispatch the TODO lists to his employees.

## General assumptions
## System design  
### Process discovery  
### Solving ambiguity
### Interfaces with other systems  
#### Payment system
#### Protocols and their performance  
### Logical design details
#### Spring
#### Project structure and architecture  
##### Aggregates
##### Events
##### Events in Repositories  
#### Database
##### ORM
### Physical code design details
#### Architecture-code gap
#### Model-code gap
### Deployment
### Fault tolerance
## Performance
### Back of the envelope calculations  
### Scalability
### Monitoring

## Ways to improve, next phases

## Tests    

### BDD  
Tests are written in a BDD manner, expressing stories defined with Example Mapping.
It means we utilize both TDD and Domain Language discovered with Event Storming.

### ArchUnit

## References

1. [Introducing EventStorming](https://leanpub.com/introducing_eventstorming) by Alberto Brandolini
2. [Domain Modelling Made Functional](https://pragprog.com/book/swdddf/domain-modeling-made-functional) by Scott Wlaschin
3. [Software Architecture for Developers](https://softwarearchitecturefordevelopers.com) by Simon Brown
4. [Clean Architecture](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164) by Robert C. Martin
5. [Domain-Driven Design: Tackling Complexity in the Heart of Software](https://www.amazon.com/Domain-Driven-Design-Tackling-Complexity-Software/dp/0321125215) by Eric Evans