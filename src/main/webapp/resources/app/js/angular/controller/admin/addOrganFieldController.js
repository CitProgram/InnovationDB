/**
 * Created by pc9 on 09.06.16.
 */
adminApp.controller('addOrganFieldController',
    ['$scope', '$http','$location', function($scope, $http, $location){
        var config = {
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
                }
        }
        $http.get('/getMemberships').success(function (data) {
            $scope.memberships = data;
        });
        var myDataParser = function(array, flag){
            for(var i = 0; i<array.length; i++ ){

                if (array[i].name == flag){
                    return array[i];
                }
            }
        }

        var fitter = function (array) {
            var result = []
            if (array != undefined) {
                for (var i = 0; i < array.length; i++) {
                    result[i] =   array[i].id


                }
            }
            return result;
        }
        $scope.SendData = function (flag) {
            var adresses = [
                {name: 'location',   url: '/setLocation',    data: 'name=' + $scope.location},
                {name: 'membership', url: '/setMembership',  data: 'name=' + $scope.membership},
                {name: 'sphere',     url: '/setScope',       data: 'name=' + $scope.sphere},
                {name: 'phase',      url: '/setPhase',       data: 'name=' + $scope.phase},
                {name: 'subject',    url: '/setSubject',     data: 'name=' + $scope.subjectName +
                '&url=' + $scope.subjectUrl + '&memId=' +  fitter($scope.membershipForSubject)}
            ];

            var adress = myDataParser(adresses, flag);
            var data   = adress.data;
            var url    = adress.url;
            alert("req" + adress.data)
            $http.post(url, data, config)
                .success(function (data, status, headers, config) {
                    alert("response" + data)
                    $scope.message = data;
                    data = null;
                })
                .error(function (data, status, headers, config) {
                    alert("failure message: " + JSON.stringify({data: data}));
                });
        }



    }]);




