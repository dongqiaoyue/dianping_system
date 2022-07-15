var map;
var geocoder;

function initMap() {
    var options = {
        center: {lat: 42.3980, lng: -71.0364},
        zoom: 8
    }
    geocoder = new google.maps.Geocoder();
    map = new google.maps.Map(document.getElementById("map"), options);
}

function codeAddress() {
    var address = document.getElementById('address').value;
    geocoder.geocode( { 'address': address}, function(results, status) {
        // console.log(results);
        // console.log(results[0].geometry.location.lat());
        if (status == 'OK') {
            map.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker({
                map: map,
                position: results[0].geometry.location
            });
            $("#latitude").val(getFloat(results[0].geometry.location.lat(), 6));
            $("#longitude").val(getFloat(results[0].geometry.location.lng(), 6));
        } else {
            alert('Geocode was not successful for the following reason: ' + status);
        }
    });
}