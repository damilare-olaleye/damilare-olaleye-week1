# Scrum

## Background 
![scrum diagram](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.QMrhspj5SwZcIHsFixTCYgHaEK%26pid%3DApi&f=1)

Scrum is an agile framework. In other words, it is a defined process with actionable steps to be Agile. Bowrrowing terminology from OOP, Agile is abstract, whille Scrum is a concrete implementation of Agile.

The organization that developed the Scrum methodology created a guide known as the Scrum Guide that contains information on Scrum, found [here](https://scrumguides.org/scrum-guide.html)

They define Scrum as a "lightweight framework that helps people, teams, and organizations generate value through adaptive solutions for complex problems."

To understand Scrum, it is important to understand what a **sprint** is. Additonally, ther are three different high level ideas to be aware of. These are the Scrum
- Artifacts
- Roles
- Ceremonies

# Sprint
A Sprint is fundamentally the most important part of Scrum. It is where ideas are transformed into actual value in the form of **usable increments**.

Sprint characteristics:
- Should be fixed in length ranging from 1 to 4 weeks (2 weeks is typical)
- The product backlog is the input to a Sprint
- A potentially shippable increment is the output for a Sprint

# Scrum Artifacts
Scrum artifacts are used to help manage work and progress that needs to be made. There are three artifacts:
- Product backlog
    - An ordered list of everything that is currently part of the vision for the product
    - The product backlog is always changing and is never completed
    - The product owner is reponsible for creating items and maintaining the product backlog
        - Job title of the product owner: PRODUCT MANAGER
- Sprint backlog
    - List of everything that the Scrum team decided for a particular sprint
    - Once planned and decided upon, only the development team can add more items to it
    - If the development team decides to remove an item from the Sprint backlog, they must negotiate this removal with the product owner
- Usuable product increment
    - The actual product at the end of the Sprinit
    - It must be "potentially releasable"
    - All completed items should meet the team's "definition of done"

# User Story
![userstory](https://wac-cdn.atlassian.com/dam/jcr:a679339b-0098-4c88-acdb-7009b0de6efb/epics-vs-stories-agile-development.png?cdnVersion=41)
User stories are the items contained in the product backlog and sprint backlog. They are features to be developed, written from the perspective of a user of the software. 

Benefits of user stories. 
- Keeps the focus on the user
- Stories enable collaboration
- Stories drive creative solutions
- Stories create momentum

Reference: [Atlassian](https://www.atlassian.com/agile/project-management/user-stories)

User story format:
- You should start with
    - "As a"
    - "I want to"
    - "So that I"

Example: Adding Numbers Calculator Apps
- As a user
- I want to be able to input two numbers and click the add button 
- So that I can find the sum of those two numbers

There are a couple of considerations when writing user stories:
- Acceptance criteria
- Definition of Done
- Story pointing
- Burndown charts (track progress quantitatively)

## Acceptance Criteria
Acceptance criteria help to define when the functionality of a user story has actually been implemented. From the perspective of a user, the criteria is what they would percieve as "acceptable"

Acceptance criteria 1:
- Given that I am at the add numbers page of the website
- When I type in 10
- And I type in 25
- And click add
- Then I should see the the result of 35

Acceptance citeria 2: 
- Given that I am at the add numbers page of the website
- When I do not type in anything in the first input for a number
- But I do type in 20 for the second input for a number
- And I click add
- Then I should receive a message that says "No number found for the first input"

Acceptance citeria 3: 
- Given that I am at the add numbers page of the website
- When I do not type in 20
- But I do type in anything  for the second input for a number
- And I click add
- Then I should receive a message that says "No number found for the second input"

Acceptance citeria 4: 
- Given that I am at the add numbers page of the website
- When I do not type in anything in the first input for a number
- But I do not type in anything for the second input for a number
- And I click add
- Then I should receive a message that says "No number found for both the first and second input"

## Definition of Done
The definition of done is defined by the Scrum team. It specifies what need needs to be fulfilled for a user story to be considered complete. 

For example: 
- Acceptance criteria met?
- Is the code peer reviewed?
- Do our unit tests for the code pass?
- Do our integration tests for the code pass?
- Do our automated E2E tests pass?
- Does the product owner approve of the feature that has been implemented?

## Story Pointing
Story pointing is all about estimatin the amount of effort to complete a particular user story. This is accomplished by assigning a value to a user story. Rather than producing a concrete estimate (days, weeks), we use story points instead. 

Story points could be 
- Fibonacci numbers (1, 1, 2, 3, 5, 8, 13 ...)
- T-shirt sizes (XS, S, M, L, XL)
- etc.

## Burdown chart
![burndown chart](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.96vFtfvNqSKX33_2L9omVQHaEc%26pid%3DApi&f=1)

- Used to track progress of a sprint
- All of the user stories' story points are added up in the Sprint backlog
- As user stories are completed, the number of story points remaining can ve visualized
- Should ideally go to 0 by the end of the Sprint. 

# Scrum Roles
1. Scrum Master
    - Responsible for facilating proper Scrum practices within both the Scrum team and the wider organization
    - Help to clarify questions team members may have about Scrums
    - Assist in the removal of **impediments/blockers** in whatever way they can 
    - Facilitate the **Scrum ceremonies**
2. Product Owner
    - Creates and orders the product backlog items
    - Explicitly communicates the product goal
    - Serves as the point of contact between the client and the Scrum team
3. Development Team
    - Software engineers + testers
    - Responsible for developing usable increments in each Sprint
    - Adapting their plan towards the Sprint goal 
    - Holding each other accountable

# Scrum Team
The Scrum roles describe the roles of different people involved in a small team known as a **Scrum team**. A Scrum team consists of 
    - One Scrum master
    - One product owner
    - Many developers/testers

Scrum teams should reallyy 
    - Have 10 or fewer people
    - Have no hierrarchies
    - Be cross-functional
    - Be self-managing 

# Scrum Ceremonies
The Scrum ceremonies are the "official" Scrum meetings. Ceremonies are designed to enable the transparency required for adapting and improving.

These ceremonies are of course not the only meetings that will realistically happen of course, but they should help to minimize meetings not defined within the Scrum framework. It is important to make the most of the Scrum ceremonies/meetings in order to create shared understanding and reduce ambiguity.

The ceremonies corresponding to a particular Sprint are as follows:
1. Sprint planning meeting
    - Lays out work for the Sprint
    - The entire Scrum team works together
        - The product owner facilitates discussion about the most important product backlog items and how they relate to the product goal
        - The developers plan work that is necessary to accomplish each user story
    - No more than 8 hours  

