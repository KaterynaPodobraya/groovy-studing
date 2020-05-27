package operators

class DataTypes {
    public static void main(String[] args) {
        def i= 32000
        println i.getClass().getSimpleName()

        def bd = 100.25
        println bd.getClass().getSimpleName()

        def f = 100.25f
        println f.getClass().getSimpleName()

        def d = 100.25d
        println d.getClass().getSimpleName()

        def l = 100000000000000000
        println l.getClass().getSimpleName()

        def bi = 10000000000000000000000
        println bi.getClass().getSimpleName()

        def x = 10
        10.times {println x+=10}
       // 10.upto{}
       // 10.downto({})

        10.step(20, 0.5, {y -> println y})

        assert 5 == '5'.toInteger()
    }
}
