/*
 * Copyright 2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
class MaterialDesignIconicFontGrailsPlugin {

    def version = '2.1.2'
    def grailsVersion = '2.0 > *'

    def pluginExcludes = [
            'grails-app/views/error.gsp'
    ]

    def title = 'Material Design Iconic Font Plugin'
    def author = 'Alexey Zhokhov'
    def authorEmail = 'donbeave@gmail.com'
    def description = '''\
Material Design Iconic Font is a full suite of material design icons (created and maintained by Google) for easy scalable vector graphics on websites.
'''

    def documentation = 'https://github.com/donbeave/grails-material-design-iconic-font'

    def license = 'APACHE'

    def developers = [
            [name: 'Alexey Zhokhov', email: 'donbeave@gmail.com']
    ]

    def issueManagement = [system: 'GITHUB',
                           url   : 'https://github.com/donbeave/grails-material-design-iconic-font/issue']
    def scm = [url: 'https://github.com/donbeave/grails-material-design-iconic-font']

}