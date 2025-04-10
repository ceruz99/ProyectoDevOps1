// vue.config.js
module.exports = {
  publicPath: '/citizen/',

  css: {
    loaderOptions: {
      scss: {
        implementation: require('sass'),
      },
      sass: {
        implementation: require('sass'),
        sassOptions: {
          indentedSyntax: true,
        },
      },
    },
  },
};
