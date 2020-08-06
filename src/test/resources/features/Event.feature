Feature: Event page
  User Story:
  As a user, I should be able to create
  events by clicking on Event tab under Activity Stream.

  Acceptance Criteria:

  1.User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.

  Background: Login
    Given User is on the login page
    When User enters correct username "helpdesk49@cybertekschool.com"
    And User enters correct password "UserUser"
    And User clicks login button

  @UploadFilesAndImages
  Scenario Outline:User should be able to upload "<options>"
    When User clicks the tab"<tab>"
    And User clicks the icon "<icon>"
    And User clicks the option "<options>"
    #And User "<uploads>" files or image from PC
   # And User clicks the button "<buttons>"
    #Then User should be able to see "<attached>"

    Examples:
      | tab   | icon         | options                 | uploads                                      | buttons        | attached     |
      | Event | Upload files | upload files and images | /Users/selcuksudemirci/Desktop/UploadPic.png | Insert in text | Picture&File |
      #| Event | Upload files | select document from bitrix24 | /Users/selcuksudemirci/Desktop/UploadPic.png | Insert in text | Picture&File |
      #| Event | Upload files | create Using desktop applications | /Users/selcuksudemirci/Desktop/UploadPic.png | Insert in text | Picture&File |
      #| Event | Upload files | download from external drive  | /Users/selcuksudemirci/Desktop/UploadPic.png | Insert in text | Picture&File |


  @AttachLink
  Scenario Outline:User should be able to attach link text:"<link text>" and link Url:"<link URL>"by clicking on the link icon.
    When User clicks the tab"<tab>"
    And User clicks the icon "<icon>"
    And User enters  the link text  "<link text>" and "<link URL>"
   # And User clicks the button "<buttons>"
    Then User should be able to see "<verification>"

    Examples:
      | tab   | icon | link text | link URL                | verification |
      | Event | link | Google    | https://www.google.com/ | Google       |