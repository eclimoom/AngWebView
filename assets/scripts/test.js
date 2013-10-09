/**
 * Use for [FILEName].
 * Author: hejj
 * Date: 13-10-9
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
'use strict';
var testApp = angular.module('testApp', []);
testApp.controller('TestController', function ($scope, $http) {
    console.log("aaaaaaaa");
    $scope.controllerMethod = function(host,cid){
        $scope.host = "cc:"+host;
    } ;
    $scope.controllerMethod(devicePara.host,devicePara.cid);
});

