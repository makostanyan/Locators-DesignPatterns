Feature: Check if books correct

  Background:
    Given Initialize driver

  @smoke
  Scenario: Check some books name
    Given The user opens Amazon website
    When Click on books department
    And Search name that is fixed
    Then Match authors name and book name
      | Agatha Christie |And Then There Were None|
      | Agatha Christie |Hercule Poirot: The Complete Short Stories: A Hercule Poirot Collection with Foreword by Charles Todd (Hercule Poirot Mysteries)|
      | Agatha Christie |AGATHA CHRISTIE Premium Collection: The Mysterious Affair at Styles, The Secret Adversary, The Murder on the Links, The Cornish Mystery, Hercule Poirot's Cases|
      | Agatha Christie |Murder on the Orient Express: A Hercule Poirot Mystery|
      | Agatha Christie |The Seven Dials Mystery (Superintendent Battle Book 2)|
      | Agatha Christie |The ABC Murders|
      | Agatha Christie |Death on the Nile: A Hercule Poirot Mystery|
      | Agatha Christie |The Mysterious Affair at Styles: The Queen of Mystery's First Published Novel|
      | Agatha Christie |The Mysterious Affair at Styles: Hercule Poirot's First Case (Special Edition)|
      | Agatha Christie |Midwinter Murder: Fireside Tales from the Queen of Mystery|
      | Agatha Christie |Cat Among the Pigeons: A Hercule Poirot Mystery|
      | Agatha Christie |A Hercule Poirot Trio: The Mysterious Affair at Styles, The Murder on the Links, Poirot Investigates|
      | Agatha Christie |World's Favourite Agatha Christie Book|
      | Agatha Christie |Best of Agatha Christie Volumes 1-4|
      | Agatha Christie |Agatha Christie The Best Of Poirot 5 Books Box Set Collection Pack|
      | Agatha Christie |AGATHA CHRISTIE Collection: The Mysterious Affair at Styles, Poirot Investigates, The Murder on the Links, The Secret Adversary, The Man in the Brown Suit|

