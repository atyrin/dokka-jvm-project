package org.jetbrains.qa.signatures.overloads



/**
 * Method for overloading without parameters
 * @return [Unit] returns nothing but
 */
fun method(){}

/**
 * Method for overloading with 1 parameter
 * @param p the only [Int] parameter
 * @return [Unit] returns nothing but
 */
fun method(p: Int){}

/**
 * Method for overloading with 1 parameter
 * @param p the only [Int] parameter
 * @param p1 the second [Int] parameter
 * @return [Unit] returns nothing but
 */
fun method(p: Int, p1: Int){}

/**
 * Method for overloading with 2 parameter
 * @param p the only [Int] parameter
 * @param p1 the second [Int] parameter
 * @param p2 the third [Int] parameter
 * @return [Unit] returns nothing but
 */
fun method(p: Int, p1: Int, p2: Int){}

/**
 * A class with overloads
 * @constructor default
 * @constructor non-default
 */
class OverloadedClass{

    /**
     * Default constructor
     */
    constructor(){}

    constructor(p1: Int){}

    constructor(p1: Int, p2: Int){}

    /**
     * Method for overloading without parameters
     * @return [Unit] returns nothing but
     */
    fun method(){}

    /**
     * Method for overloading with 1 parameter
     * @param p the only [Int] parameter
     */
    fun method(p: Int){}
    fun method(p: Int, p1: Int){}
    fun method(p: Int, p1: Int, p2: Int){}


    /**
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas et molestie nisl, et pharetra libero. Donec at porttitor massa. Suspendisse potenti. Sed sit amet elit id odio fermentum mattis. Nunc at justo est. Pellentesque nec commodo ipsum, malesuada efficitur ante. Ut id consequat felis. In leo dolor, congue non aliquet commodo, tempus ut lacus. Morbi porttitor maximus interdum. Vivamus turpis est, euismod nec lorem a, lacinia rhoncus risus. Donec pulvinar id tortor eu placerat. Nunc ullamcorper ultricies lectus vel fermentum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc sit amet erat nisl. Integer sed accumsan orci. Pellentesque interdum posuere sem ac imperdiet.
     *
     * Nulla facilisi. Morbi eget sagittis mauris, eget faucibus ligula. Aenean sit amet augue vitae nisi semper commodo. Sed tortor risus, rhoncus eu leo nec, vehicula maximus metus. Proin lobortis arcu justo, vel consectetur erat vestibulum id. Quisque tincidunt ante quis mauris tempus, ac dapibus arcu facilisis. In eros odio, ullamcorper at leo ac, accumsan lacinia dui.
     *
     * Nunc ut sapien auctor, posuere libero molestie, vehicula leo. Donec ac libero est. Etiam ultrices aliquam magna, nec dignissim purus tempus placerat. Duis lobortis metus et laoreet porta. Sed elementum cursus ante, ac semper tortor tempus efficitur. Maecenas dapibus varius libero id pharetra. Integer at consequat diam. Sed ornare tellus at diam condimentum, id fermentum diam scelerisque.
     *
     * Etiam semper ante eu purus facilisis eleifend. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam ultricies pulvinar lectus, ut cursus tellus suscipit eu. Donec vulputate enim non nisi scelerisque suscipit. Suspendisse ullamcorper sed tellus in consectetur. Proin bibendum tempus erat ut pharetra. Vestibulum placerat elit enim, eu vehicula dui cursus volutpat. Aliquam sit amet mattis nisl. Duis quis nunc maximus, semper ligula et, efficitur leo. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum non pulvinar dui. Nulla pulvinar lorem sit amet ligula gravida malesuada. Mauris vehicula mi sit amet quam eleifend, at scelerisque erat feugiat. Aliquam id mi id leo viverra cursus aliquam vitae sapien. Vestibulum eu augue ullamcorper, finibus lacus eu, maximus tellus. Vestibulum sagittis nisi ut tincidunt accumsan.
     *
     * Pellentesque egestas, nibh sit amet porttitor facilisis, lorem augue laoreet ipsum, ut consectetur est erat nec augue. Nam pellentesque nunc sed congue pharetra. Ut justo risus, condimentum vitae lectus et, venenatis aliquet sem. Vestibulum eleifend lacus ac orci porta, quis pellentesque enim aliquam. Duis eget fringilla massa. Sed tempus pellentesque tellus, sit amet scelerisque augue sollicitudin a. Aenean vel libero nec purus dignissim ornare. Nulla facilisi. Nam bibendum porta nisl, vel interdum nulla vestibulum et. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.
     *
     * Phasellus sollicitudin imperdiet dignissim. Etiam pellentesque nunc ac vulputate egestas. Suspendisse varius ut eros vitae sollicitudin. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse blandit libero magna, pulvinar faucibus odio rhoncus eget. In cursus nisl eu urna bibendum eleifend. Mauris finibus sem nec viverra posuere. In eu augue nisi. Duis consectetur interdum sem, blandit placerat arcu tincidunt feugiat. Suspendisse molestie erat ante, eget consectetur purus efficitur ut. Nam rutrum tortor nec purus pellentesque, id rutrum nulla euismod. Proin quis rutrum nisl, ut efficitur enim. Phasellus quis mauris non tortor pharetra vulputate et ac mi.
     *
     * Maecenas vehicula quam ut lectus suscipit suscipit. Nulla molestie velit et bibendum consectetur. Etiam blandit quam sapien, id placerat justo luctus ut. Quisque luctus eu risus nec laoreet. Cras eget lobortis dui. Mauris luctus purus sed nulla porta bibendum. Aenean consectetur leo lacus, quis congue est hendrerit in. Integer dignissim libero felis, non gravida sem ullamcorper vel. Vestibulum venenatis nisl et risus consectetur, congue congue turpis viverra. Praesent euismod dolor in odio interdum, nec vehicula neque laoreet. Pellentesque auctor mollis est, egestas semper nunc ornare quis. Curabitur sed nunc pretium, maximus sapien ut, fringilla nunc.
     *
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec ligula et nisl ultrices imperdiet. Nullam dapibus rutrum elit, at eleifend turpis ultrices viverra. Nunc dictum eget risus vitae rhoncus. Vivamus pellentesque congue quam, at laoreet erat semper at. Praesent felis sem, condimentum consectetur tristique id, dictum nec quam. Mauris pharetra, enim pharetra auctor tincidunt, neque nisi consectetur sem, sit amet cursus sapien urna vitae ante. Curabitur tincidunt nisl purus, quis sollicitudin diam dapibus vitae. Integer consequat urna at sagittis suscipit. Ut porta vel lacus tempus pretium. Proin faucibus ligula blandit, egestas magna a, interdum nisl.
     *
     * Maecenas pharetra finibus orci, viverra bibendum nibh tempus nec. Ut quis leo tellus. Sed sollicitudin nisl quis mi venenatis, at fringilla ante faucibus. Ut id cursus leo, id hendrerit turpis. Sed elementum condimentum urna eget blandit. Integer ullamcorper feugiat lectus vel gravida. Mauris aliquet fringilla est sed efficitur. In hendrerit odio non odio suscipit, vel egestas magna tempus. Nam lectus libero, tincidunt et rutrum sit amet, bibendum quis quam. Sed interdum erat ligula, rutrum elementum est congue eget. Ut aliquet nisl velit, nec scelerisque ligula tempor quis. Nulla et tortor ut sem malesuada venenatis. Nulla ut nibh sed leo lobortis cursus convallis at felis. Cras augue purus, pulvinar at mattis quis, venenatis sed magna. Morbi eleifend, orci eget pharetra sollicitudin, felis sem imperdiet metus, at dapibus tellus elit ornare nunc.
     *
     * In mattis lacinia rutrum. Aliquam porta, sapien a gravida vulputate, neque ligula maximus massa, ac sollicitudin lorem dolor eu ligula. Integer vel iaculis orci. Nam gravida aliquet urna congue imperdiet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed fermentum lobortis leo, quis tempus sem bibendum a. Vivamus fringilla nec sem ac elementum. Fusce eget felis volutpat, ultrices orci sodales, aliquet lacus. Nunc rhoncus, metus non ornare dictum, mauris eros pulvinar lorem, ac lobortis nulla urna eget purus. Integer eget ex et neque dignissim suscipit nec nec ante. Phasellus in libero sagittis, luctus urna ac, egestas enim.
     * @param p param 1 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas et molestie nisl, et pharetra libero. Donec at porttitor massa. Suspendisse potenti. Sed sit amet elit id odio fermentum mattis. Nunc at justo est. Pellentesque nec commodo ipsum, malesuada efficitur ante. Ut id consequat felis. In leo dolor, congue non aliquet commodo, tempus ut lacus. Morbi porttitor maximus interdum. Vivamus turpis est, euismod nec lorem a, lacinia rhoncus risus. Donec pulvinar id tortor eu placerat. Nunc ullamcorper ultricies lectus vel fermentum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc sit amet erat nisl. Integer sed accumsan orci. Pellentesque interdum posuere sem ac imperdiet.
     *
     * Nulla facilisi. Morbi eget sagittis mauris, eget faucibus ligula. Aenean sit amet augue vitae nisi semper commodo. Sed tortor risus, rhoncus eu leo nec, vehicula maximus metus. Proin lobortis arcu justo, vel consectetur erat vestibulum id. Quisque tincidunt ante quis mauris tempus, ac dapibus arcu facilisis. In eros odio, ullamcorper at leo ac, accumsan lacinia dui.
     *
     * Nunc ut sapien auctor, posuere libero molestie, vehicula leo. Donec ac libero est. Etiam ultrices aliquam magna, nec dignissim purus tempus placerat. Duis lobortis metus et laoreet porta. Sed elementum cursus ante, ac semper tortor tempus efficitur. Maecenas dapibus varius libero id pharetra. Integer at consequat diam. Sed ornare tellus at diam condimentum, id fermentum diam scelerisque.
     *
     * Etiam semper ante eu purus facilisis eleifend. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam ultricies pulvinar lectus, ut cursus tellus suscipit eu. Donec vulputate enim non nisi scelerisque suscipit. Suspendisse ullamcorper sed tellus in consectetur. Proin bibendum tempus erat ut pharetra. Vestibulum placerat elit enim, eu vehicula dui cursus volutpat. Aliquam sit amet mattis nisl. Duis quis nunc maximus, semper ligula et, efficitur leo. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum non pulvinar dui. Nulla pulvinar lorem sit amet ligula gravida malesuada. Mauris vehicula mi sit amet quam eleifend, at scelerisque erat feugiat. Aliquam id mi id leo viverra cursus aliquam vitae sapien. Vestibulum eu augue ullamcorper, finibus lacus eu, maximus tellus. Vestibulum sagittis nisi ut tincidunt accumsan.
     *
     * Pellentesque egestas, nibh sit amet porttitor facilisis, lorem augue laoreet ipsum, ut consectetur est erat nec augue. Nam pellentesque nunc sed congue pharetra. Ut justo risus, condimentum vitae lectus et, venenatis aliquet sem. Vestibulum eleifend lacus ac orci porta, quis pellentesque enim aliquam. Duis eget fringilla massa. Sed tempus pellentesque tellus, sit amet scelerisque augue sollicitudin a. Aenean vel libero nec purus dignissim ornare. Nulla facilisi. Nam bibendum porta nisl, vel interdum nulla vestibulum et. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.
     *
     * Phasellus sollicitudin imperdiet dignissim. Etiam pellentesque nunc ac vulputate egestas. Suspendisse varius ut eros vitae sollicitudin. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse blandit libero magna, pulvinar faucibus odio rhoncus eget. In cursus nisl eu urna bibendum eleifend. Mauris finibus sem nec viverra posuere. In eu augue nisi. Duis consectetur interdum sem, blandit placerat arcu tincidunt feugiat. Suspendisse molestie erat ante, eget consectetur purus efficitur ut. Nam rutrum tortor nec purus pellentesque, id rutrum nulla euismod. Proin quis rutrum nisl, ut efficitur enim. Phasellus quis mauris non tortor pharetra vulputate et ac mi.
     *
     * Maecenas vehicula quam ut lectus suscipit suscipit. Nulla molestie velit et bibendum consectetur. Etiam blandit quam sapien, id placerat justo luctus ut. Quisque luctus eu risus nec laoreet. Cras eget lobortis dui. Mauris luctus purus sed nulla porta bibendum. Aenean consectetur leo lacus, quis congue est hendrerit in. Integer dignissim libero felis, non gravida sem ullamcorper vel. Vestibulum venenatis nisl et risus consectetur, congue congue turpis viverra. Praesent euismod dolor in odio interdum, nec vehicula neque laoreet. Pellentesque auctor mollis est, egestas semper nunc ornare quis. Curabitur sed nunc pretium, maximus sapien ut, fringilla nunc.
     *
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec ligula et nisl ultrices imperdiet. Nullam dapibus rutrum elit, at eleifend turpis ultrices viverra. Nunc dictum eget risus vitae rhoncus. Vivamus pellentesque congue quam, at laoreet erat semper at. Praesent felis sem, condimentum consectetur tristique id, dictum nec quam. Mauris pharetra, enim pharetra auctor tincidunt, neque nisi consectetur sem, sit amet cursus sapien urna vitae ante. Curabitur tincidunt nisl purus, quis sollicitudin diam dapibus vitae. Integer consequat urna at sagittis suscipit. Ut porta vel lacus tempus pretium. Proin faucibus ligula blandit, egestas magna a, interdum nisl.
     *
     * Maecenas pharetra finibus orci, viverra bibendum nibh tempus nec. Ut quis leo tellus. Sed sollicitudin nisl quis mi venenatis, at fringilla ante faucibus. Ut id cursus leo, id hendrerit turpis. Sed elementum condimentum urna eget blandit. Integer ullamcorper feugiat lectus vel gravida. Mauris aliquet fringilla est sed efficitur. In hendrerit odio non odio suscipit, vel egestas magna tempus. Nam lectus libero, tincidunt et rutrum sit amet, bibendum quis quam. Sed interdum erat ligula, rutrum elementum est congue eget. Ut aliquet nisl velit, nec scelerisque ligula tempor quis. Nulla et tortor ut sem malesuada venenatis. Nulla ut nibh sed leo lobortis cursus convallis at felis. Cras augue purus, pulvinar at mattis quis, venenatis sed magna. Morbi eleifend, orci eget pharetra sollicitudin, felis sem imperdiet metus, at dapibus tellus elit ornare nunc.
     *
     * In mattis lacinia rutrum. Aliquam porta, sapien a gravida vulputate, neque ligula maximus massa, ac sollicitudin lorem dolor eu ligula. Integer vel iaculis orci. Nam gravida aliquet urna congue imperdiet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed fermentum lobortis leo, quis tempus sem bibendum a. Vivamus fringilla nec sem ac elementum. Fusce eget felis volutpat, ultrices orci sodales, aliquet lacus. Nunc rhoncus, metus non ornare dictum, mauris eros pulvinar lorem, ac lobortis nulla urna eget purus. Integer eget ex et neque dignissim suscipit nec nec ante. Phasellus in libero sagittis, luctus urna ac, egestas enim.
     *
     * @param p2 param 2
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas et molestie nisl, et pharetra libero. Donec at porttitor massa. Suspendisse potenti. Sed sit amet elit id odio fermentum mattis. Nunc at justo est. Pellentesque nec commodo ipsum, malesuada efficitur ante. Ut id consequat felis. In leo dolor, congue non aliquet commodo, tempus ut lacus. Morbi porttitor maximus interdum. Vivamus turpis est, euismod nec lorem a, lacinia rhoncus risus. Donec pulvinar id tortor eu placerat. Nunc ullamcorper ultricies lectus vel fermentum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nunc sit amet erat nisl. Integer sed accumsan orci. Pellentesque interdum posuere sem ac imperdiet.
     *
     * Nulla facilisi. Morbi eget sagittis mauris, eget faucibus ligula. Aenean sit amet augue vitae nisi semper commodo. Sed tortor risus, rhoncus eu leo nec, vehicula maximus metus. Proin lobortis arcu justo, vel consectetur erat vestibulum id. Quisque tincidunt ante quis mauris tempus, ac dapibus arcu facilisis. In eros odio, ullamcorper at leo ac, accumsan lacinia dui.
     *
     * Nunc ut sapien auctor, posuere libero molestie, vehicula leo. Donec ac libero est. Etiam ultrices aliquam magna, nec dignissim purus tempus placerat. Duis lobortis metus et laoreet porta. Sed elementum cursus ante, ac semper tortor tempus efficitur. Maecenas dapibus varius libero id pharetra. Integer at consequat diam. Sed ornare tellus at diam condimentum, id fermentum diam scelerisque.
     *
     * Etiam semper ante eu purus facilisis eleifend. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam ultricies pulvinar lectus, ut cursus tellus suscipit eu. Donec vulputate enim non nisi scelerisque suscipit. Suspendisse ullamcorper sed tellus in consectetur. Proin bibendum tempus erat ut pharetra. Vestibulum placerat elit enim, eu vehicula dui cursus volutpat. Aliquam sit amet mattis nisl. Duis quis nunc maximus, semper ligula et, efficitur leo. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum non pulvinar dui. Nulla pulvinar lorem sit amet ligula gravida malesuada. Mauris vehicula mi sit amet quam eleifend, at scelerisque erat feugiat. Aliquam id mi id leo viverra cursus aliquam vitae sapien. Vestibulum eu augue ullamcorper, finibus lacus eu, maximus tellus. Vestibulum sagittis nisi ut tincidunt accumsan.
     *
     * Pellentesque egestas, nibh sit amet porttitor facilisis, lorem augue laoreet ipsum, ut consectetur est erat nec augue. Nam pellentesque nunc sed congue pharetra. Ut justo risus, condimentum vitae lectus et, venenatis aliquet sem. Vestibulum eleifend lacus ac orci porta, quis pellentesque enim aliquam. Duis eget fringilla massa. Sed tempus pellentesque tellus, sit amet scelerisque augue sollicitudin a. Aenean vel libero nec purus dignissim ornare. Nulla facilisi. Nam bibendum porta nisl, vel interdum nulla vestibulum et. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.
     *
     * Phasellus sollicitudin imperdiet dignissim. Etiam pellentesque nunc ac vulputate egestas. Suspendisse varius ut eros vitae sollicitudin. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse blandit libero magna, pulvinar faucibus odio rhoncus eget. In cursus nisl eu urna bibendum eleifend. Mauris finibus sem nec viverra posuere. In eu augue nisi. Duis consectetur interdum sem, blandit placerat arcu tincidunt feugiat. Suspendisse molestie erat ante, eget consectetur purus efficitur ut. Nam rutrum tortor nec purus pellentesque, id rutrum nulla euismod. Proin quis rutrum nisl, ut efficitur enim. Phasellus quis mauris non tortor pharetra vulputate et ac mi.
     *
     * Maecenas vehicula quam ut lectus suscipit suscipit. Nulla molestie velit et bibendum consectetur. Etiam blandit quam sapien, id placerat justo luctus ut. Quisque luctus eu risus nec laoreet. Cras eget lobortis dui. Mauris luctus purus sed nulla porta bibendum. Aenean consectetur leo lacus, quis congue est hendrerit in. Integer dignissim libero felis, non gravida sem ullamcorper vel. Vestibulum venenatis nisl et risus consectetur, congue congue turpis viverra. Praesent euismod dolor in odio interdum, nec vehicula neque laoreet. Pellentesque auctor mollis est, egestas semper nunc ornare quis. Curabitur sed nunc pretium, maximus sapien ut, fringilla nunc.
     *
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec ligula et nisl ultrices imperdiet. Nullam dapibus rutrum elit, at eleifend turpis ultrices viverra. Nunc dictum eget risus vitae rhoncus. Vivamus pellentesque congue quam, at laoreet erat semper at. Praesent felis sem, condimentum consectetur tristique id, dictum nec quam. Mauris pharetra, enim pharetra auctor tincidunt, neque nisi consectetur sem, sit amet cursus sapien urna vitae ante. Curabitur tincidunt nisl purus, quis sollicitudin diam dapibus vitae. Integer consequat urna at sagittis suscipit. Ut porta vel lacus tempus pretium. Proin faucibus ligula blandit, egestas magna a, interdum nisl.
     *
     * Maecenas pharetra finibus orci, viverra bibendum nibh tempus nec. Ut quis leo tellus. Sed sollicitudin nisl quis mi venenatis, at fringilla ante faucibus. Ut id cursus leo, id hendrerit turpis. Sed elementum condimentum urna eget blandit. Integer ullamcorper feugiat lectus vel gravida. Mauris aliquet fringilla est sed efficitur. In hendrerit odio non odio suscipit, vel egestas magna tempus. Nam lectus libero, tincidunt et rutrum sit amet, bibendum quis quam. Sed interdum erat ligula, rutrum elementum est congue eget. Ut aliquet nisl velit, nec scelerisque ligula tempor quis. Nulla et tortor ut sem malesuada venenatis. Nulla ut nibh sed leo lobortis cursus convallis at felis. Cras augue purus, pulvinar at mattis quis, venenatis sed magna. Morbi eleifend, orci eget pharetra sollicitudin, felis sem imperdiet metus, at dapibus tellus elit ornare nunc.
     *
     * In mattis lacinia rutrum. Aliquam porta, sapien a gravida vulputate, neque ligula maximus massa, ac sollicitudin lorem dolor eu ligula. Integer vel iaculis orci. Nam gravida aliquet urna congue imperdiet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed fermentum lobortis leo, quis tempus sem bibendum a. Vivamus fringilla nec sem ac elementum. Fusce eget felis volutpat, ultrices orci sodales, aliquet lacus. Nunc rhoncus, metus non ornare dictum, mauris eros pulvinar lorem, ac lobortis nulla urna eget purus. Integer eget ex et neque dignissim suscipit nec nec ante. Phasellus in libero sagittis, luctus urna ac, egestas enim.
     *
     *
     * @param p3 param 3
     *
     *
     * @return [Unit] return nothing
     */
    fun method(p: Int, p1: Int, p2: Int, p3: Int){}
}


open class OverloadParent{
    /**
     * Method of the [OverloadParent]
     */
    fun method(){}

    /**
     * Method with 1 param of the [OverloadParent]
     */
    fun method(p1: String){}
}

class OverloadChild: OverloadParent(){
    /**
     * Method with 2 param of the [OverloadChild]
     * @param p1 param 1
     * @param p2 param 2
     */
    fun method(p1: String ,p2: String){}

    /**
     * Method with 3 param of the [OverloadChild]
     * @param p1 param 1
     * @param p2 param 2
     * @param p3 param 3
     */
    fun method(p1: String, p2: String, p3: String){}
}

/**
 * Extension for String
 */
fun String.extensionOverload(){

}

/**
 * Extension for Any
 */
fun Any.extensionOverload(){

}

/**
 * Also: https://github.com/Kotlin/dokka/issues/3612
 * Call [OverloadWithDifferentDeclarations.me] -- unclear where it will navigate.
 */
class OverloadWithDifferentDeclarations{
    val me: String = ""
    fun me() {}
}

/**
 * Ticket: [issue](https://github.com/Kotlin/dokka/issues/4049)
 */
class OverloadWithVarargFunctions{
    fun overloaded() {}
    fun overloaded(s: String) {}
    fun overloaded(vararg s: String) {}
}

/**
 * Overload for 2 toplevel functions. This one without vararg
 * Ticket: [issue](https://github.com/Kotlin/dokka/issues/4049)
 *
 * @see [overloadWithVararg]
 */
fun overloadWithVararg(novararg: String){}

/**
 * Overload for 2 toplevel functions. This one with vararg
 * Ticket: [issue](https://github.com/Kotlin/dokka/issues/4049)
 *
 * @see [overloadWithVararg]
 */
fun overloadWithVararg(vararg elements: String){}