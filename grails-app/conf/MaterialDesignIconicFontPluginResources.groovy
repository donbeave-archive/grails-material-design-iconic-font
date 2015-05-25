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
import grails.util.Environment
import grails.util.Holders
import org.slf4j.LoggerFactory

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
def log = LoggerFactory.getLogger('grails.plugin.MaterialDesignIconicFontPluginResources')
def pluginManager = Holders.pluginManager
boolean lesscssPlugin = pluginManager.getGrailsPlugin('lesscss-resources') || pluginManager.getGrailsPlugin('less-resources')
def configDefaultBundle = Holders.config.grails.plugin.materialdesigniconicfont.defaultBundle
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_material-design-iconic-font'
}

log.debug "config: grails.plugin.materialdesigniconicfont.defaultBundle = $configDefaultBundle"
log.debug "is lesscss-resources plugin loaded? $lesscssPlugin"

String cssFile = Environment.developmentMode ? 'material-design-iconic-font.css' : 'material-design-iconic-font.min.css'

modules = {

    'material-design-iconic-font-css' {
        defaultBundle configDefaultBundle

        resource id: 'material-design-iconic-font-css',
                url: [plugin: 'material-design-iconic-font',
                      dir   : 'css',
                      file  : cssFile],
                disposition: 'head',
                exclude: 'minify'
    }

    'material-design-iconic-font-less' {
        defaultBundle configDefaultBundle

        resource id: 'material-design-iconic-font-less',
                url: [plugin: 'material-design-iconic-font',
                      dir   : 'less',
                      file  : 'material-design-iconic-font.less'],
                attrs: [rel  : 'stylesheet/less',
                        type : 'css',
                        order: 120],
                disposition: 'head'
    }

    'material-design-iconic-font' {
        defaultBundle configDefaultBundle

        dependsOn lesscssPlugin ? 'material-design-iconic-font-less' : 'material-design-iconic-font-css'
    }

}
