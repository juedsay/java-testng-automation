Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links
 
# Scenario Outline: I can access the subpages through the navigation bar 
#     Given I navigate to www.freerangetesters.com
#     When I go to <section> using the navigation bar
#     Examples:
#         | section   |
#         | Academia  |
#         | Cursos    |
#         | Mentorías |
#         | Udemy     |
#         | Blog      |
#         | Recursos  |

#   Scenario: Courses are presented correctly to potencial customers
#       Given I navigate to www.freerangetesters.com
#       When I go to Cursos using the navigation bar
#       And Select Introducción al Testing de Software

    Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangetesters.com
        When I select Elegir Plan
        Then I can validate the options in the checkout page