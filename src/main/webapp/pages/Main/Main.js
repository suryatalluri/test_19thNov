Application.$controller("MainPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action with the variables inside this block(on-page-load) */
    $scope.onPageVariablesReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. $scope.Variables.staticVariable1.getData()
         */
    };

    /* perform any action with widgets inside this block */
    $scope.onPageReady = function() {
        /*
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. $scope.Widgets.byId(), $scope.Widgets.byName()or access widgets by $scope.Widgets.widgetName
         */
    };


    $scope.switch1Change = function($event, $isolateScope) {
        if ($scope.Widgets.switch1.datavalue == "List") {
            $scope.Widgets.panel1.show = true;
            $scope.panel2.show = false;
        }
        if ($scope.Widgets.switch1.datavalue == "Grid") {
            $scope.Widgets.panel1.show = false;
            $scope.Widgets.panel2.show = true;
        }
    }


}]);

Application.$controller("alertdialog1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);