

Vue.component('vue-div', {
    template: '<div>Vue!</div>'
});

var app = new Vue({
    el: '#app',
    data () {
        return {
            info: null
        }
    },
    mounted () {
        axios
            .get('http://localhost:8080/basic')
            .then(response => (this.info = response))
    }
});
