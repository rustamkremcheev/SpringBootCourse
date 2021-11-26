package io.javabrains.springbootstarter.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public  String sayHello() {
        return  "{\"data\":{\"result\":\"05000\",\"resultMessage\":\"Successful\",\"reportBase64\":\"PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iV0lORE9XUy0xMjUxIj8+PHJlcG9ydD48cmVhc29uPm51bGw8L3JlYXNvbj48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjM8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjM1MDAwMDwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4wPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+NDIwMDA8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjQ8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjM1MDAwMDwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4wPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+NDIwMDA8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjU8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjM1MDAwMDwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4wPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+NDIwMDA8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjY8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjM1MDAwMDwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4wPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+NDIwMDA8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjc8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjMyNDkzOTwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4xMjQ8L2lucHNfc3VtPjxzYWxhcnlfdGF4X3N1bT4zODk5Mi42ODwvc2FsYXJ5X3RheF9zdW0+PC9kYXRhPjxkYXRhPjxwaW5mbD4zMjUwODc5MjE4MDAxMjwvcGluZmw+PG5zMTFfY29kZT4xNjwvbnMxMV9jb2RlPjxjb21wYW55X3Rpbj4yMDQ3MDg3NjI8L2NvbXBhbnlfdGluPjxwZXJpb2Q+ODwvcGVyaW9kPjxudW1iZXJfcGFzc3BvcnQ+MTkxNzYyPC9udW1iZXJfcGFzc3BvcnQ+PHllYXI+MjAxOTwveWVhcj48b3RoZXJfaW5jb21lPjAuMDwvb3RoZXJfaW5jb21lPjxzYWxhcnk+MzI0OTM5PC9zYWxhcnk+PHByb3BfaW5jb21lPm51bGw8L3Byb3BfaW5jb21lPjxzZXJpZXNfcGFzc3BvcnQ+QUM8L3Nlcmllc19wYXNzcG9ydD48Y29tcGFueV9uYW1lPtCk0KUgJnF1b3Q7WVVTVVBKT04gSE9KSSBJWkJPU0FST1YmcXVvdDs8L2NvbXBhbnlfbmFtZT48dGluPjQ0NTg5MjY2OTwvdGluPjxuYW1lPkpBWE9OQk9ZRVYgQUxPQklERElOIEtPTU9MSURESU4gT+KAmEfigJhMSTwvbmFtZT48bnMxMF9jb2RlPjE0PC9uczEwX2NvZGU+PGlucHNfc3VtPjEyNDwvaW5wc19zdW0+PHNhbGFyeV90YXhfc3VtPjM4OTkyLjY4PC9zYWxhcnlfdGF4X3N1bT48L2RhdGE+PGRhdGE+PHBpbmZsPjMyNTA4NzkyMTgwMDEyPC9waW5mbD48bnMxMV9jb2RlPjE2PC9uczExX2NvZGU+PGNvbXBhbnlfdGluPjIwNDcwODc2MjwvY29tcGFueV90aW4+PHBlcmlvZD45PC9wZXJpb2Q+PG51bWJlcl9wYXNzcG9ydD4xOTE3NjI8L251bWJlcl9wYXNzcG9ydD48eWVhcj4yMDE5PC95ZWFyPjxvdGhlcl9pbmNvbWU+MC4wPC9vdGhlcl9pbmNvbWU+PHNhbGFyeT4zMjQ5Mzk8L3NhbGFyeT48cHJvcF9pbmNvbWU+bnVsbDwvcHJvcF9pbmNvbWU+PHNlcmllc19wYXNzcG9ydD5BQzwvc2VyaWVzX3Bhc3Nwb3J0Pjxjb21wYW55X25hbWU+0KTQpSAmcXVvdDtZVVNVUEpPTiBIT0pJIElaQk9TQVJPViZxdW90OzwvY29tcGFueV9uYW1lPjx0aW4+NDQ1ODkyNjY5PC90aW4+PG5hbWU+SkFYT05CT1lFViBBTE9CSURESU4gS09NT0xJRERJTiBP4oCYR+KAmExJPC9uYW1lPjxuczEwX2NvZGU+MTQ8L25zMTBfY29kZT48aW5wc19zdW0+MjAwPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+Mzg5OTIuNjg8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48ZGF0YT48cGluZmw+MzI1MDg3OTIxODAwMTI8L3BpbmZsPjxuczExX2NvZGU+MTY8L25zMTFfY29kZT48Y29tcGFueV90aW4+MjA0NzA4NzYyPC9jb21wYW55X3Rpbj48cGVyaW9kPjEwPC9wZXJpb2Q+PG51bWJlcl9wYXNzcG9ydD4xOTE3NjI8L251bWJlcl9wYXNzcG9ydD48eWVhcj4yMDE5PC95ZWFyPjxvdGhlcl9pbmNvbWU+MC4wPC9vdGhlcl9pbmNvbWU+PHNhbGFyeT4zMjQ5Mzk8L3NhbGFyeT48cHJvcF9pbmNvbWU+bnVsbDwvcHJvcF9pbmNvbWU+PHNlcmllc19wYXNzcG9ydD5BQzwvc2VyaWVzX3Bhc3Nwb3J0Pjxjb21wYW55X25hbWU+0KTQpSAmcXVvdDtZVVNVUEpPTiBIT0pJIElaQk9TQVJPViZxdW90OzwvY29tcGFueV9uYW1lPjx0aW4+NDQ1ODkyNjY5PC90aW4+PG5hbWU+SkFYT05CT1lFViBBTE9CSURESU4gS09NT0xJRERJTiBP4oCYR+KAmExJPC9uYW1lPjxuczEwX2NvZGU+MTQ8L25zMTBfY29kZT48aW5wc19zdW0+MDwvaW5wc19zdW0+PHNhbGFyeV90YXhfc3VtPjM4OTkyLjY4PC9zYWxhcnlfdGF4X3N1bT48L2RhdGE+PGRhdGE+PHBpbmZsPjMyNTA4NzkyMTgwMDEyPC9waW5mbD48bnMxMV9jb2RlPjE2PC9uczExX2NvZGU+PGNvbXBhbnlfdGluPjIwNDcwODc2MjwvY29tcGFueV90aW4+PHBlcmlvZD4xMTwvcGVyaW9kPjxudW1iZXJfcGFzc3BvcnQ+MTkxNzYyPC9udW1iZXJfcGFzc3BvcnQ+PHllYXI+MjAxOTwveWVhcj48b3RoZXJfaW5jb21lPjAuMDwvb3RoZXJfaW5jb21lPjxzYWxhcnk+MDwvc2FsYXJ5Pjxwcm9wX2luY29tZT5udWxsPC9wcm9wX2luY29tZT48c2VyaWVzX3Bhc3Nwb3J0PkFDPC9zZXJpZXNfcGFzc3BvcnQ+PGNvbXBhbnlfbmFtZT7QpNClICZxdW90O1lVU1VQSk9OIEhPSkkgSVpCT1NBUk9WJnF1b3Q7PC9jb21wYW55X25hbWU+PHRpbj40NDU4OTI2Njk8L3Rpbj48bmFtZT5KQVhPTkJPWUVWIEFMT0JJRERJTiBLT01PTElERElOIE/igJhH4oCYTEk8L25hbWU+PG5zMTBfY29kZT4xNDwvbnMxMF9jb2RlPjxpbnBzX3N1bT4wPC9pbnBzX3N1bT48c2FsYXJ5X3RheF9zdW0+MDwvc2FsYXJ5X3RheF9zdW0+PC9kYXRhPjxkYXRhPjxwaW5mbD4zMjUwODc5MjE4MDAxMjwvcGluZmw+PG5zMTFfY29kZT4xNjwvbnMxMV9jb2RlPjxjb21wYW55X3Rpbj4yMDQ3MDg3NjI8L2NvbXBhbnlfdGluPjxwZXJpb2Q+MTI8L3BlcmlvZD48bnVtYmVyX3Bhc3Nwb3J0PjE5MTc2MjwvbnVtYmVyX3Bhc3Nwb3J0Pjx5ZWFyPjIwMTk8L3llYXI+PG90aGVyX2luY29tZT4wLjA8L290aGVyX2luY29tZT48c2FsYXJ5PjA8L3NhbGFyeT48cHJvcF9pbmNvbWU+bnVsbDwvcHJvcF9pbmNvbWU+PHNlcmllc19wYXNzcG9ydD5BQzwvc2VyaWVzX3Bhc3Nwb3J0Pjxjb21wYW55X25hbWU+0KTQpSAmcXVvdDtZVVNVUEpPTiBIT0pJIElaQk9TQVJPViZxdW90OzwvY29tcGFueV9uYW1lPjx0aW4+NDQ1ODkyNjY5PC90aW4+PG5hbWU+SkFYT05CT1lFViBBTE9CSURESU4gS09NT0xJRERJTiBP4oCYR+KAmExJPC9uYW1lPjxuczEwX2NvZGU+MTQ8L25zMTBfY29kZT48aW5wc19zdW0+MDwvaW5wc19zdW0+PHNhbGFyeV90YXhfc3VtPjA8L3NhbGFyeV90YXhfc3VtPjwvZGF0YT48c3VjY2Vzcz50cnVlPC9zdWNjZXNzPjwvcmVwb3J0Pg==\",\"token\":null},\"errorMessage\":null,\"code\":200}";
    }

    @PostMapping("/regClaim")
    @ResponseBody
    public String sayGood(@RequestBody String json) {
        System.out.println("ReqBody: /n" + json);
        String as="{\n" +
                        "   \"result\":{\n" +
                        "      \"success\":\"0\"\n" +
                        "   },\n" +
                        "   \"header\":{\n" +
                        "      \"query_id\":\"string\",\n" +
                        "      \"inquire\":\"string\",\n" +
                        "      \"respond\":\"string\"\n" +
                        "   },\n" +
                        "   \"answer\":{\n" +
                        "      \"errors\":[\n" +
                        "         {\n" +
                        "            \"code\":\"200\",\n" +
                        "            \"comment\":\"Successfully registered\"\n" +
                        "         }\n" +
                        "      ],\n" +
                        "      \"identity\":{\n" +
                        "         \"claim_guid\":\"123456789\",\n" +
                        "         \"claim_id\":\"11849\",\n" +
                        "         \"contract_guid\":\"\",\n" +
                        "         \"contract_id\":\"\",\n" +
                        "         \"provision_guid\":\"\"\n" +
                        "      }\n" +
                        "   }\n" +
                "}";
        return as;
    }

    @PostMapping("/saveContractAns")
    @ResponseBody
    public String sayG(@RequestBody String json) {
        System.out.println("ReqBody: /n" + json);
        String as="{\n" +
                "  \"result\": {\n" +
                "    \"success\": \"0\"\n" +
                "  },\n" +
                "  \"header\": {\n" +
                "    \"query_id\": \"211820072446\",\n" +
                "    \"inquire\": \"01.07.2021 09:16:25\",\n" +
                "    \"respond\": \"01.07.2021 09:16:25\"\n" +
                "  },\n" +
                "  \"answer\": {\n" +
                "    \"errors\": [\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РЈРЅРёРєР°Р»СЊРЅС‹Р№ СЂРµРіРёСЃС‚СЂР°С†РёРѕРЅРЅС‹Р№ РЅРѕРјРµСЂ Р·Р°СЏРІРєРё РІ РђР�РЎ В«Р“Р РљР�В»)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РІРёРґР° СЃРІСЏР·Рё Р·Р°РµРјС‰РёРєР° СЃ РєСЂРµРґРёС‚РЅРѕР№ РѕСЂРіР°РЅРёР·Р°С†РёРµР№)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ СЃС‚СЂР°РЅС‹ РіСЂР°Р¶РґР°РЅСЃС‚РІР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РІРёРґР° СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РµРіРѕ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РЎРµСЂРёСЏ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РќРѕРјРµСЂ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (Р”Р°С‚Р° РІС‹РґР°С‡Рё СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РµРіРѕ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРµРј РІС‹РґР°РЅ СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РёР№ РґРѕРєСѓРјРµРЅС‚)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РџРѕС‡С‚РѕРІС‹Р№ Р°РґСЂРµСЃ РїСЂРѕР¶РёРІР°РЅРёСЏ)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (Р”РѕР»СЏ РІ СѓСЃС‚Р°РІРЅРѕРј С„РѕРЅРґРµ)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РІРёРґР° СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РµРіРѕ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РЎРµСЂРёСЏ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РќРѕРјРµСЂ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (Р”Р°С‚Р° РІС‹РґР°С‡Рё СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РµРіРѕ РґРѕРєСѓРјРµРЅС‚Р°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРµРј РІС‹РґР°РЅ СѓРґРѕСЃС‚РѕРІРµСЂСЏСЋС‰РёР№ РґРѕРєСѓРјРµРЅС‚)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РџРѕС‡С‚РѕРІС‹Р№ Р°РґСЂРµСЃ РїСЂРѕР¶РёРІР°РЅРёСЏ)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РєР»Р°СЃСЃР° РєСЂРµРґРёС‚РѕСЃРїРѕСЃРѕР±РЅРѕСЃС‚Рё Р·Р°РµРјС‰РёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04016\",\n" +
                "        \"comment\": \"РќРµРІРµСЂРЅС‹Р№ С„РѕСЂРјР°С‚ Р·РЅР°С‡РµРЅРёСЏ СЂРµРєРІРёР·РёС‚Р° (РџСЂРѕС†РµРЅС‚РЅР°СЏ СЃС‚Р°РІРєР° (Р·Р°РїСЂРµС‰РµРЅРЅС‹Рµ СЃРёРјРІРѕР»С‹: ,))\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04016\",\n" +
                "        \"comment\": \"РќРµРІРµСЂРЅС‹Р№ С„РѕСЂРјР°С‚ Р·РЅР°С‡РµРЅРёСЏ СЂРµРєРІРёР·РёС‚Р° (РџСЂРѕС†РµРЅС‚РЅР°СЏ СЃС‚Р°РІРєР° (23,8))\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РєР»РёРµРЅС‚Р° РІ РќР�Р‘Р‘Р” РґРѕР»Р¶РЅРёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (Р�РќРќ РґРѕР»Р¶РЅРёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ РєР»Р°СЃСЃР° РєСЂРµРґРёС‚РѕСЃРїРѕСЃРѕР±РЅРѕСЃС‚Рё РґРѕР»Р¶РЅРёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РќРѕРјРµСЂ С‚РµР»РµС„РѕРЅР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (Р РµРіРёСЃС‚СЂР°С†РёРѕРЅРЅС‹Р№ РЅРѕРјРµСЂ РєРѕРЅС‚СЂР°РєС‚Р° РІ Р•Р\u00ADР�РЎ Р’Рћ)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РљРѕРґ СЃС‚СЂР°РЅС‹ РґРѕР»Р¶РЅРёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РќР°РёРјРµРЅРѕРІР°РЅРёРµ РґРѕР»Р¶РЅРёРєР°)\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"code\": \"04012\",\n" +
                "        \"comment\": \"РћС‚СЃСѓС‚СЃС‚РІСѓРµС‚ РѕР±СЏР·Р°С‚РµР»СЊРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ (РќРѕРјРµСЂ С‚РµР»РµС„РѕРЅР°)\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"identity\": {\n" +
                "      \"claim_guid\": \"\",\n" +
                "      \"claim_id\": \"44483\",\n" +
                "      \"contract_guid\": \"\",\n" +
                "      \"contract_id\": \"44483\",\n" +
                "      \"provision_guid\": \"\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        return as;
    }
}
