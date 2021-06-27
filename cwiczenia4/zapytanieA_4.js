printjson(
db.people.aggregate(
    [{$group: {
            _id: "$nationality",
            avg_bmi:{$avg:{$divide:[{$toDouble: "$weight"},{$multiply:[{ $divide:[{$toDouble:"$height"},100]},{ $divide:[{$toDouble:"$height"},100]}]}]}},
            min_bmi : {$min: {$divide : [{$toDouble: "$weight"},{$multiply:[{ $divide:[{$toDouble:"$height"},100]},{ $divide:[{$toDouble:"$height"},100]}]}]}},
            max_bmi : {$max: {$divide : [{$toDouble: "$weight"},{$multiply:[{ $divide:[{$toDouble:"$height"},100]},{ $divide:[{$toDouble:"$height"},100]}]}]}}
        }}]
    ).toArray())