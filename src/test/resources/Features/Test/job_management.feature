#Meherin Amir
Feature: Test for Job management Functionality


Background:
  Given user open browser with credentials


@postajob
Scenario: post an attested job
  When user click job management menu
  And  user clicks post a job
  And  user enters job summery
  And  user enters Basic Info


@postaskillsearch
Scenario: post a skill search
  When user clicks post a skill search job
  And  user inputs skill search job post


@postaninternaljob
Scenario: post a internal job
  When user clicks post an internal job
  And  user clicks internal job summery
  And  user inputs internal basic info









