mocha.setup('bdd'); //import mocha.setup method
const assert = chai.assert; //call assert from chai
const expect = chai.expect; //call expect from chai

//describe function to run the test suite
describe('my first Test Suite', function() {
    //first function to test
    it('introduces a test suite', function() {
        //default value : true, we expect true as the input for pass
        expect(true).to.equals(true);
    });
    //second function to test
    it('introduces a fail suite', function() {
        //default value: true, and we get false as input so it fails
        expect(true).to.equals(false);
    });
});

//call run method to runt est
mocha.run();
