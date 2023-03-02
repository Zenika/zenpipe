Feature: Update deal from pipedrive webhook
  User update or create deal in pipedrive web UI, some custom fields of this deal may be enriched

  Scenario Outline: Receive deal update event
    Given A deal <dealId> with custom fields <organizationId> <portfolioId> <pipelineId> <AM> <CT>
    When  An update deal event is received with <dealId>
    Then return deal <dealId> with custom field <expected PF> <expected AM> <expected CT>
    Examples:
      | dealId | organizationId | portfolioId | pipelineId | AM | CT | expected PF | expected AM | expected CT |
      | 587    |                |             | 1          |    |    |             |             |             |
      | 587    | 325            |             | 1          |    |    | 1406        |             |             |
      | 587    | 325            | 1406        | 2          |    |    | 1406        | 15215636    | 15608369    |
