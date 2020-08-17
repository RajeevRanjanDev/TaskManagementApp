# Task Management Application in play 2.5.x
Database name would be task_mgmt
Request would be in this way 
Here Status will be only OPEN,CLOSED,IN_PROGRESS,IN_REVIEW,ERROR

http://localhost:9000/tasks

[
    {
        "id": 38,
        "name": "Developmnet",
        "description": "Delopment related task",
         "tags": [
            "v.01",
            "v.02"
        ],
        "status": "OPEN",
        "created_at": "2020-07-09"
    },
    {   "id": 37,
         "name": "Testing",
        "description": "Testing related task",
        "tags": [
            "v.01",
            "v.02"
        ],
        "status": "OPEN",
        "created_at": "2020-07-10"
    }
]


Example of get Request
http://localhost:9000/tasks?page=1&page_size=5&sort_by=id&sort_mode=ASC&name=Testing&status=OPEN


[
 {   "id": 37,
         "name": "Testing",
        "description": "Testing related task",
        "tags": [
            "v.01",
            "v.02"
        ],
        "status": "OPEN",
        "created_at": "2020-07-10"
    }
]